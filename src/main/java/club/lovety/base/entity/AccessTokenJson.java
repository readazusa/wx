package club.lovety.base.entity;

/**
 * club.lovety.base.entity
 * Created by smc
 * date on 2016/4/13.
 * Email:sunmch@163.com
 */
public class AccessTokenJson {
    private String access_token;

    private String expires_in;

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AccessTokenJson{");
        sb.append("access_token='").append(access_token).append('\'');
        sb.append(", expires_in='").append(expires_in).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
