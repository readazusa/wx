package club.lovety.controller;

import club.lovety.base.entity.YmOpenIdInfo;
import club.lovety.base.service.IWechatApiService;
import club.lovety.common.WeChatUrlUtils;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * club.lovety.controller
 * Created by smc
 * date on 2016/5/12.
 * Email:sunmch@163.com
 * oauth认证controller
 */
@Controller
@RequestMapping("oauth")
public class OAuthController {


    private static  final Logger log = LoggerFactory.getLogger(OAuthController.class);

    @Resource
    private IWechatApiService wechatApiService;

    /**
     * 如果用户同意授权，页面将跳转至 redirect_uri/?code=CODE&state=STATE。
     * @param request
     * @return
     */
    @RequestMapping("code")
    public String getCode(HttpServletRequest request){
        log.debug("接收回调返回");
        String code = request.getParameter("code");
        log.debug("返回的code:{}",code);
        String state = request.getParameter("state");
        String url = WeChatUrlUtils.YM_OPENID_URL.replace("CODE",code);
        String ymJsonResult = wechatApiService.doGet(url);
        YmOpenIdInfo ymOpenIdInfo = JSON.parseObject(ymJsonResult,YmOpenIdInfo.class);
        log.debug("通过页面授权获取的openid信息实体类: {}",ymOpenIdInfo);
        request.getSession().setAttribute("openId",ymOpenIdInfo.getOpenid());
//        request.getSession().setAttribute("user",ymOpenIdInfo);
        return "portal/index";
    }
}
