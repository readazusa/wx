package club.lovety.user.dao;


import club.lovety.base.dao.IDao;
import club.lovety.user.entity.UserInfo;

/**
 * club.lovety.user.dao
 * Created by smc
 * date on 2016/4/19.
 * Email:sunmch@163.com
 */
public interface IUserInfoDao extends IDao<UserInfo>{

    public  UserInfo  getUserInfoByOpenId(String opendId);

    public int updateSubDate(UserInfo userInfo);
}
