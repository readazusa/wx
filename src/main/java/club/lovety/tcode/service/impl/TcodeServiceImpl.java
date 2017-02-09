package club.lovety.tcode.service.impl;

import club.lovety.base.service.IWechatApiService;
import club.lovety.common.WeChatUrlUtils;
import club.lovety.tcode.entity.ReqTCode;
import club.lovety.tcode.service.ITcodeService;
import club.lovety.util.HttpUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ty on 2017/2/9.
 */

@Service
public class TcodeServiceImpl implements ITcodeService {

    @Resource
    private IWechatApiService wechatApiService;

    @Override
    public String createTCode(String url) {
        ReqTCode reqTCode = new ReqTCode();
        reqTCode.setExpire_seconds("2592000");
        reqTCode.setAction_name("QR_SCENE");
        return wechatApiService.doPost(url,reqTCode);
    }

    @Override
    public Object downCode(String tickct) {
        String result = HttpUtils.getInstance().get(WeChatUrlUtils.T_CODE_DOWNLOAD_URL.replace("TICKET",tickct),"code");
        return result;
    }
}
