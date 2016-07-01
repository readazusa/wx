package club.lovety.base.entity;

import club.lovety.common.Constants;

/**
 * club.lovety.base.entity
 * Created by smc
 * date on 2016/5/24.
 * Email:sunmch@163.com
 * 微信H5页面支付所需实体类
 */
public class WxPayConfig {

    private String  appId= Constants.APPID;

    private String timeStamp;

    private String nonceStr;

    private String payPackage;

    private String signType="MD5";

    private String paySign;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getPayPackage() {
        return payPackage;
    }

    public void setPayPackage(String payPackage) {
        this.payPackage = payPackage;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WxPayConfig{");
        sb.append("appId='").append(appId).append('\'');
        sb.append(", timeStamp='").append(timeStamp).append('\'');
        sb.append(", nonceStr='").append(nonceStr).append('\'');
        sb.append(", payPackage='").append(payPackage).append('\'');
        sb.append(", signType='").append(signType).append('\'');
        sb.append(", paySign='").append(paySign).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
