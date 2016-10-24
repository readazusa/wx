package club.lovety.controller;

import club.lovety.base.service.IWechatApiService;
import club.lovety.common.Constants;
import club.lovety.common.WeChatUrlUtils;
import club.lovety.util.SecUtils;
import club.lovety.util.UuidUtils;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/**
 * Created by 念梓  on 2016/10/22.
 * Email:sunmch@163.com
 * author: 念梓
 * des:测试微信api的推送
 */
@RequestMapping("test")
@Controller
public class TestApiController {

    private static final Logger log = LoggerFactory.getLogger(TestApiController.class);

    @Resource
    private IWechatApiService wechatApiService;

    @RequestMapping("send")
    @ResponseBody
    public Object testSend() {
        log.debug("================================================");
        Map<String, Object> map = new HashMap<>();
        map.put("touser", "oIynWvqHADqIDJwwWaF_d-RvES6w");
        map.put("template_id", "okjQL1P2nmgNUj-uIdMnSDf1GKsBdUPcFvT_29QxesU");
        map.put("url", "http://www.baidu.com");
        Map<String, String> first = new HashMap<>();
        first.put("value", "你的宝贝已发生");
        Map<String, String> delivername = new HashMap<>();
        delivername.put("value", "快乐公司");
        Map<String, String> ordername = new HashMap<>();
        ordername.put("value", "DESW1212121212121221");
        Map<String, String> remark = new HashMap<>();
        remark.put("value", "快递已发送，请注意查收");
        Map<String, Object> data = new HashMap<>();
        data.put("first", first);
        data.put("delivername", delivername);
        data.put("ordername", ordername);
        data.put("remark", remark);
        map.put("data", data);
        wechatApiService.doPost(WeChatUrlUtils.SEND_TEMPLATE_URL, map);
        log.debug("发送的模板信息: {}", JSON.toJSONString(map));

        return null;
    }


    @RequestMapping("jssdk")
    public String jssdk(HttpServletRequest request,ModelMap model) {
        String url = request.getRequestURL().toString();
        String noncestr = UuidUtils.getUpperUuid();
        String timestamp = String.valueOf(System.currentTimeMillis());
//        String url = "http://www.sunmingchun.net/wx/test/jssdk.htm";
        String jsapi_ticket = wechatApiService.getJsApiTicket();
        Map<String, Object> map = new TreeMap<>();
        map.put("noncestr", noncestr);
        map.put("timestamp", timestamp);
        map.put("url", url);
        map.put("jsapi_ticket", jsapi_ticket);
        String signature = createSignature(map);
        map.put("appId", Constants.APPID);
        map.put("signature",signature);
        model.put("config",map);
        return "test/jssdk";
    }

    private String createSignature(Map<String, Object> source) {
        Set set = source.keySet();
        StringBuffer sb = new StringBuffer();
        set.forEach(key -> {
            sb.append(key).append("=").append(source.get(key)).append("&");
        });
        String sign = SecUtils.getSha1(sb.toString().substring(0,sb.length()-1));
        return sign;
    }

}
