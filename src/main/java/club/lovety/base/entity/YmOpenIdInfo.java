package club.lovety.base.entity;

/**
 * club.lovety.base.entity
 * Created by smc
 * date on 2016/5/23.
 * Email:sunmch@163.com
 * 页面授权获取openid
 */
public class YmOpenIdInfo {

    private String access_token;  //网页授权接口调用凭证,注意：此access_token与基础支持的access_token不同

    private long expires_in;  //access_token接口调用凭证超时时间，单位（秒）

    private String refresh_token;  //用户刷新access_token

    private String openid;  //用户唯一标识，请注意，在未关注公众号时，用户访问公众号的网页，也会产生一个用户和公众号唯一的OpenID

    private String scope;  //用户授权的作用域，使用逗号（,）分隔

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public long getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(long expires_in) {
        this.expires_in = expires_in;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("YmOpenIdInfo{");
        sb.append("access_token='").append(access_token).append('\'');
        sb.append(", expires_in=").append(expires_in);
        sb.append(", refresh_token='").append(refresh_token).append('\'');
        sb.append(", openid='").append(openid).append('\'');
        sb.append(", scope='").append(scope).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
