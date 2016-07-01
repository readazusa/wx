package club.lovety.base.entity;

import club.lovety.common.Constants;

/**
 * club.lovety.base.entity
 * Created by smc
 * date on 2016/5/10.
 * Email:sunmch@163.com
 * jssdk 配置文件参数
 */
public class WxConfig {

    public boolean debug = false;

    public String appId= Constants.APPID;

    private String timestamp;

    private String nonceStr;

    private String signature;

    private String jsApiList;

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getJsApiList() {
        return jsApiList;
    }

    public void setJsApiList(String jsApiList) {
        this.jsApiList = jsApiList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WxConfig{");
        sb.append("debug=").append(debug);
        sb.append(", appId='").append(appId).append('\'');
        sb.append(", timestamp='").append(timestamp).append('\'');
        sb.append(", nonceStr='").append(nonceStr).append('\'');
        sb.append(", signature='").append(signature).append('\'');
        sb.append(", jsApiList='").append(jsApiList).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
