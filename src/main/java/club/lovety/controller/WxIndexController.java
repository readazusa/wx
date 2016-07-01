package club.lovety.controller;


import club.lovety.base.service.IWechatApiService;
import club.lovety.common.MenuType;
import club.lovety.common.WeChatUrlUtils;
import club.lovety.message.menu.MenuButton;
import club.lovety.message.menu.WechatMenu;
import club.lovety.service.IMsgService;
import club.lovety.util.UuidUtils;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * club.lovety.controller
 * Created by smc
 * date on 2016/3/23.
 * Email:sunmch@163.com
 */
@Controller
@RequestMapping("wx")
public class WxIndexController {

    private static final Logger log = LoggerFactory.getLogger(WxIndexController.class);

    @Resource
    private IMsgService msgService;

    @Resource
    private IWechatApiService wechatApiService;

    /**
     * 初始化关注微信
     */
    @RequestMapping(value = "init", method = RequestMethod.GET)
    public String init(HttpServletRequest request, ModelMap model) {
        String signature = request.getParameter("signature");   //验证
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        log.debug("signature:[{}],timestamp:[{}],nonce:[{}],echostr:[{}]", signature, timestamp, nonce, echostr);
        model.put("echostr", echostr);
        return "echostr";
    }

    @RequestMapping(value = "init", method = RequestMethod.POST)
    public String execute(HttpServletRequest request, ModelMap model) {
        log.debug("测试");
        String result = msgService.executeMsg(request);
        log.debug("发送数据内容: {}", result);
        model.put("echostr", result);
        wechatApiService.createMenu();
        return "echostr";
    }

}
