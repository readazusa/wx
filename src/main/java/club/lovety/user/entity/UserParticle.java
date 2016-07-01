package club.lovety.user.entity;

import java.util.Date;

/**
 * club.lovety.user.entity
 * Created by smc
 * date on 2016/4/19.
 * Email:sunmch@163.com
 * 用户运动轨迹
 */
public class UserParticle {

    private String uid;

    private String openId;

    private String realName;

    private String nick;

    private String latitude;  //	地理位置纬度

    private String longitude;	//地理位置经度

    private String precisions; //	地理位置精度

    private Date createTime;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPrecisions() {
        return precisions;
    }

    public void setPrecisions(String precisions) {
        this.precisions = precisions;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
