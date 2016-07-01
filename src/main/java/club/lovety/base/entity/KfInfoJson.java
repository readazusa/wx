package club.lovety.base.entity;

/**
 * club.lovety.base.entity
 * Created by smc
 * date on 2016/4/16.
 * Email:sunmch@163.com
 * 客服信息实体类
 */
public class KfInfoJson {


    private String kf_account;

    private String nickname;

    private String password;

    public String getKf_account() {
        return kf_account;
    }

    public void setKf_account(String kf_account) {
        this.kf_account = kf_account;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("KfInfoJson{");
        sb.append("kf_account='").append(kf_account).append('\'');
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
