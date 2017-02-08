package club.lovety.tcode.controller;

import club.lovety.common.WeChatUrlUtils;
import club.lovety.tcode.service.ITcodeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by ty on 2017/2/8.
 */

@Controller
@RequestMapping("tcode")
public class TcodeController {

    @Resource
    private ITcodeService tcodeService;

    @RequestMapping("create/ls")
    @ResponseBody
    public Object createLsCode(){
        return tcodeService.createTCode(WeChatUrlUtils.T_CODE_CREATE_LS_URL);
    }

    @RequestMapping("load/code")
    @ResponseBody
    public Object loadCode(){

        return null;
    }




}
