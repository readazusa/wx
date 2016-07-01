package club.lovety.common;

import club.lovety.base.entity.WxConfig;
import club.lovety.util.SecUtils;
import club.lovety.util.UuidUtils;

/**
 * club.lovety.common
 * Created by smc
 * date on 2016/5/10.
 * Email:sunmch@163.com
 */
public class WxConfigUtils {

    public static final WxConfig getWxConfig(String url,String ticket){
            WxConfig wxConfig = new WxConfig();
            String nonce = createNonceStr();
            String timestamp = createTimestamp();
            wxConfig.setNonceStr(nonce);
            wxConfig.setTimestamp(timestamp);
            wxConfig.setSignature(createSignature(nonce,timestamp,url,ticket));
            return wxConfig;
    }
    private static String createNonceStr() {
        return UuidUtils.getUuid();
    }

    private static String createTimestamp() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }

    private static String createSignature(String nonce,String timestamp,String url,String ticket){
        StringBuffer sb = new StringBuffer();
        sb.append("jsapi_ticket=").append(ticket).append("&noncestr=").append(nonce).append("&timestamp=").append(timestamp).append("&url=").append(url);
        String str = sb.toString();
        String sign = SecUtils.getSha1(str);
        return sign;
    }

}
