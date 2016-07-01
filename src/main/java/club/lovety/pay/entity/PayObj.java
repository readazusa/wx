package club.lovety.pay.entity;

/**
 * club.lovety.pay.entity
 * Created by smc
 * date on 2016/5/6.
 * Email:sunmch@163.com
 * 微信支付发送统一订单实体类
 *
 */
public class PayObj {

    private String appid ="wxf13b2cb7e7db3cb4";  //微信分配的公众账号 ID

    private String mch_id="1332993701";  //微信支付分配的商户号

    private String device_info; // 终端设备号(门店号或收银设备ID)，注意：PC网页或公众号内支付请传"WEB"

    private String nonce_str;  //随机字符串，不长于 32 位

    private String sign;  //签名，签名方式详见 1.5 节

    private String body;  //商品描述

    private String  detail; //商品名称明细列表

    private String  attach; //附加数据，原样返回

    private String out_trade_no; // 商户系统内部的订单号,32 个 字符内、可包含字母, 确保在商 户系统唯一 总

    private String fee_type; //符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型

    private int total_fee;  //订单总金额，单位为分，只能 整数

    private String spbill_create_ip; //订单生成的机器 IP

    private  String time_start;  //订单失效时间，格式为 yyyyMMddHHmmss，如 2009 年 12 月 27 日 9 点 10 分 10 秒 表示为 20091227091010。时 区为 GMT+8 beijing。该时间取 自商户服务器 商

    private String time_expire;  // 订单失效时间，格式为 yyyyMMddHHmmss，如 2009 年 12 月 27 日 9 点 10 分 10 秒 表示为 20091227091010。时 区为 GMT+8 beijing。该时间取 自商户服务器

    private String goods_tag; //商品标记，微信平台配置的商 品标记，用于优惠券或者满减 使用

    private String notify_url = "http://www.sunmingchun.net/weixin/pay/receive.htm";  //接收微信支付异步通知回调地址，通知url必须为直接可访问的url，不能携带参数。

    private String trade_type="JSAPI";  //取值如下：JSAPI，NATIVE，APP，详细说明见参数规定

    private String product_id; //trade_type=NATIVE，此参数必传。此id为二维码中包含的商品ID，商户自行定义。


    private String limit_pay;  //no_credit--指定不能使用信用卡支付

    private String openid; //trade_type=JSAPI，此参数必传，用户在商户appid下的唯一标识。openid如何获取，可参考【获取openid】。企业号请使用【企业号OAuth2.0接口】获取企业号内成员userid，再调用【企业号userid转openid接口】进行转换

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public int getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(int total_fee) {
        this.total_fee = total_fee;
    }

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public String getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(String time_expire) {
        this.time_expire = time_expire;
    }

    public String getGoods_tag() {
        return goods_tag;
    }

    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getLimit_pay() {
        return limit_pay;
    }

    public void setLimit_pay(String limit_pay) {
        this.limit_pay = limit_pay;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PayObj{");
        sb.append("appid='").append(appid).append('\'');
        sb.append(", mch_id='").append(mch_id).append('\'');
        sb.append(", device_info='").append(device_info).append('\'');
        sb.append(", nonce_str='").append(nonce_str).append('\'');
        sb.append(", sign='").append(sign).append('\'');
        sb.append(", body='").append(body).append('\'');
        sb.append(", detail='").append(detail).append('\'');
        sb.append(", attach='").append(attach).append('\'');
        sb.append(", out_trade_no='").append(out_trade_no).append('\'');
        sb.append(", fee_type='").append(fee_type).append('\'');
        sb.append(", total_fee=").append(total_fee);
        sb.append(", spbill_create_ip='").append(spbill_create_ip).append('\'');
        sb.append(", time_start='").append(time_start).append('\'');
        sb.append(", time_expire='").append(time_expire).append('\'');
        sb.append(", goods_tag='").append(goods_tag).append('\'');
        sb.append(", notify_url='").append(notify_url).append('\'');
        sb.append(", trade_type='").append(trade_type).append('\'');
        sb.append(", product_id='").append(product_id).append('\'');
        sb.append(", limit_pay='").append(limit_pay).append('\'');
        sb.append(", openid='").append(openid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
