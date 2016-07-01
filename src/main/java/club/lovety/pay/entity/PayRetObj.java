package club.lovety.pay.entity;

/**
 * club.lovety.pay.entity
 * Created by smc
 * date on 2016/5/7.
 * Email:sunmch@163.com
 */
public class PayRetObj {
    private  String return_code;   //SUCCESS/FAIL 此字段是通信标识，非交易标 识，交易是否成功需要查看 result_code 来判断

    private String return_msg;  //返回信息，如非空，为错误原因 签名失败 参数格式校验错误

    /****************************************
     * **以下字段在return_code为SUCCESS的时候有返回***
     *****************************************/

    private String appid;  //微信分配的公众账号 ID

    private String mch_id;   //微信支付分配的商户号

    private String device_info;  //微信支付分配的终端设备号，

    private String nonce_str;  //随机字符串，不长于 32 位

    private String sign;  //

    private String result_code; //SUCCESS/FAIL

    private String err_code;  //结果信息描述
    
    private String err_code_des; //错误返回的信息描述

    /*******************************************************************
     * 以下字段在 return_code 和 result_code 都为 SUCCESS 的时候有返回 **
     ********************************************************************/

    private String trade_type; //调用接口提交的交易类型，取值如下：JSAPI，NATIVE，APP，详细说明见参数规定

    private String prepay_id; //微信生成的预支付回话标识，用于后续接口调用中使用，该值有效期为2小时

    private String code_url;  //trade_type为NATIVE是有返回，可将该参数值生成二维码展示出来进行扫码支付

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getErr_code_des() {
        return err_code_des;
    }

    public void setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getPrepay_id() {
        return prepay_id;
    }

    public void setPrepay_id(String prepay_id) {
        this.prepay_id = prepay_id;
    }

    public String getCode_url() {
        return code_url;
    }

    public void setCode_url(String code_url) {
        this.code_url = code_url;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PayRetObj{");
        sb.append("return_code='").append(return_code).append('\'');
        sb.append(", return_msg='").append(return_msg).append('\'');
        sb.append(", appid='").append(appid).append('\'');
        sb.append(", mch_id='").append(mch_id).append('\'');
        sb.append(", device_info='").append(device_info).append('\'');
        sb.append(", nonce_str='").append(nonce_str).append('\'');
        sb.append(", sign='").append(sign).append('\'');
        sb.append(", result_code='").append(result_code).append('\'');
        sb.append(", err_code='").append(err_code).append('\'');
        sb.append(", err_code_des='").append(err_code_des).append('\'');
        sb.append(", trade_type='").append(trade_type).append('\'');
        sb.append(", prepay_id='").append(prepay_id).append('\'');
        sb.append(", code_url='").append(code_url).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
