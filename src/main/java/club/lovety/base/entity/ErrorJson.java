package club.lovety.base.entity;

/**
 * club.lovety.base.entity
 * Created by smc
 * date on 2016/4/13.
 * Email:sunmch@163.com
 * 微信接口返回错误代码json实体类
 */
public class ErrorJson {

    private String errcode;

    private String errmsg;

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ErrorJson{");
        sb.append("errcode='").append(errcode).append('\'');
        sb.append(", errmsg='").append(errmsg).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
