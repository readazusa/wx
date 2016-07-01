package club.lovety.common;

import club.lovety.base.entity.WxPayConfig;
import club.lovety.util.SecUtils;
import club.lovety.util.UuidUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.Map;
import java.util.TreeMap;

/**
 * club.lovety.common
 * Created by smc
 * date on 2016/5/24.
 * Email:sunmch@163.com
 */
public final class WxPayConfigUtils {

    private static final Logger log = LoggerFactory.getLogger(WxPayConfigUtils.class);

    public static WxPayConfig getWxPayConfig(String nonceStr, String prepay_id, String signType) {
        Assert.notNull(nonceStr, "随机数不能为空");
        Assert.notNull(prepay_id, "prepay_id不能为空");
        Assert.notNull(signType, "signType不能为空");
        WxPayConfig wxPayConfig = new WxPayConfig();
        wxPayConfig.setNonceStr(nonceStr);
        wxPayConfig.setPayPackage("prepay_id=" + prepay_id);
        wxPayConfig.setSignType(signType);
        wxPayConfig.setTimeStamp(createTimestamp());
        wxPayConfig.setPaySign(createSignature(wxPayConfig.getAppId(),wxPayConfig.getTimeStamp(),wxPayConfig.getNonceStr(),wxPayConfig.getPayPackage(),wxPayConfig.getSignType()));
        return wxPayConfig;
    }

    private static String createNonceStr() {
        return UuidUtils.getUuid();
    }

    private static String createTimestamp() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }

    private static String createSignature(String appId, String timeStamp, String nonceStr, String payPackage, String signType) {
        StringBuffer sb = new StringBuffer();
        sb.append("appId=").append(appId).append("&nonceStr=").append(nonceStr).append("&package=").append(payPackage).append("&signType=").append(signType).append("&timeStamp=").append(timeStamp).append("&key=sunmingchuntangyun1234567suntang");
        String sign = SecUtils.getMD5(sb.toString()).toUpperCase();
        log.debug("拼接url: {}",sb.toString());
        log.debug("支付的sign: {}",sign);
//        Map<String,String> map = new TreeMap<>();
//        map.put("appId",appId);
//        map.put("timeStamp",timeStamp);
//        map.put("nonceStr",nonceStr);
//        map.put("package",payPackage);
//        map.put("signType",signType);
        return sign;
    }



    public static void main(String[] args) {
        String sign = createSignature("wx2421b1c4370ec43b","1395712654","e61463f8efa94090b1f366cccfbbb444","u802345jgfjsdfgsdg888","MD5");
        System.out.println(sign);
    }
}
