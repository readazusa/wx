package club.lovety.user.service;

import club.lovety.base.service.IService;
import club.lovety.user.entity.UserInfo;

/**
 * club.lovety.user.service
 * Created by smc
 * date on 2016/4/19.
 * Email:sunmch@163.com
 */
public interface IUserInfoService extends IService<UserInfo> {

    public  UserInfo  getUserInfoByOpenId(String opendId);

    public int updateSubDate(UserInfo userInfo);  //更新

}
