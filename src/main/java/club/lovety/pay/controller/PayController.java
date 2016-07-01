package club.lovety.pay.controller;

import club.lovety.base.entity.WxConfig;
import club.lovety.base.entity.WxPayConfig;
import club.lovety.base.service.IWechatApiService;
import club.lovety.common.Constants;
import club.lovety.common.WeChatUrlUtils;
import club.lovety.common.WxConfigUtils;
import club.lovety.common.WxPayConfigUtils;
import club.lovety.pay.entity.PayObj;
import club.lovety.pay.entity.PayRetObj;
import club.lovety.portal.service.IItemService;
import club.lovety.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * club.lovety.pay.controller
 * Created by smc
 * date on 2016/5/11.
 * Email:sunmch@163.com
 * 付款回调地址
 */
@RequestMapping("pay")
@Controller
public class PayController {

    private static final Logger log = LoggerFactory.getLogger(PayController.class);

    @Resource
    private IWechatApiService wechatApiService;

    @Resource
    private IItemService itemService;

    /**
     * 接收付款返回订单
     * @return
     */
    @RequestMapping("receive")
    public String receivePay(){
        return null;
    }

    /**
     * 创建一个支付订单
     * @return
     */
    @RequestMapping("create")
    public String createPay(HttpServletRequest request,ModelMap model){
        HttpSession session = request.getSession();
        Object openId = session.getAttribute("openId");
        log.debug("支付获取session中 openid: {}",openId);
        String remoteAddr = null;
        if (request.getHeader("x-forwarded-for") == null) {
            remoteAddr =  request.getRemoteAddr();
        }else{
            remoteAddr =  request.getHeader("x-forwarded-for");
        }
        PayObj payObj = new PayObj();
        payObj.setNonce_str(createNonceStr());
        payObj.setSpbill_create_ip(remoteAddr);
        payObj.setOut_trade_no(UuidUtils.getUuid());
        payObj.setTotal_fee(10);
        payObj.setTime_start(DateFormatUtils.getFormatDate(new Date(), "yyyyMMddHHmmss"));
        payObj.setBody("测试宝贝");
        payObj.setOpenid(openId.toString());
        Map<String,Object> map = new TreeMap<>();
        map.put("appid",payObj.getAppid());
        map.put("mch_id",payObj.getMch_id());
//        map.put("device_info",payObj.getDevice_info());
        map.put("nonce_str",payObj.getNonce_str());
        map.put("body",payObj.getBody());
        map.put("out_trade_no",payObj.getOut_trade_no());
        map.put("total_fee",payObj.getTotal_fee());
        map.put("spbill_create_ip",payObj.getSpbill_create_ip());
        map.put("time_start",payObj.getTime_start() );
        map.put("notify_url",payObj.getNotify_url());
        map.put("trade_type",payObj.getTrade_type());
        map.put("openid",payObj.getOpenid());
        log.debug("发送请求的实体类:{}",payObj.toString());
        String sign = createSignature(map);
        payObj.setSign(sign);
        String payXml = XML2Object.getObj2Xml("xml", payObj);
        log.debug("发送请求的XML: {}",payXml);
        String resultPay = HttpUtils.getInstance().post(WeChatUrlUtils.PAY_FEE_URL,payXml);
        log.debug("统一订单的返回XML结果：{}",resultPay);
        PayRetObj payRetObj = XML2Object.getXml2Obj("xml",resultPay,PayRetObj.class);
        log.debug("统一订单的返回实体类结果：{}",payRetObj.toString());
        WxPayConfig wxPayConfig = WxPayConfigUtils.getWxPayConfig(payRetObj.getNonce_str(),payRetObj.getPrepay_id(),"MD5");
        model.put("wxPayConfig",wxPayConfig);
        return "portal/item/pay";
    }

    private static String createNonceStr() {
        return UuidUtils.getUuid();
    }

    private static String createSignature(Map<String,Object> source){
        Set set = source.keySet();
        StringBuffer sb = new StringBuffer();
        set.forEach(key->{
            sb.append(key).append("=").append(source.get(key)).append("&");
        });
        String string1 = sb.append("key=sunmingchuntangyun1234567suntang").toString();
        log.debug("string1: {}",string1);
        String sign = SecUtils.getMD5(string1).toUpperCase();
        return sign;
    }



}
