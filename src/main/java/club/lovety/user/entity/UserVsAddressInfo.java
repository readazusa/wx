package club.lovety.user.entity;

import java.util.Date;

/**
 * club.lovety.user.entity
 * Created by smc
 * date on 2016/4/19.
 * Email:sunmch@163.com
 * 用户地址关联表
 */
public class UserVsAddressInfo {

    private String uid;

    private String openId;

    private String addressId;

    private Date createTime;

    private Date updateTime;

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

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
