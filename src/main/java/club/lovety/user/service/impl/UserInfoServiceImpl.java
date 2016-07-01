package club.lovety.user.service.impl;

import club.lovety.user.dao.IUserInfoDao;
import club.lovety.user.entity.UserInfo;
import club.lovety.user.service.IUserInfoService;
import club.lovety.util.UuidUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * club.lovety.user.service.impl
 * Created by smc
 * date on 2016/4/19.
 * Email:sunmch@163.com
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    private static  final Logger log = LoggerFactory.getLogger(UserInfoServiceImpl.class);
    @Resource
    private IUserInfoDao userInfoDao;

    @Override
    public UserInfo queryObjectById(String id) {
        return null;
    }

    @Override
    public UserInfo queryObjectById(int id) {
        return null;
    }

    @Override
    public List<UserInfo> queryList() {
        return null;
    }

    @Override
    public int save(UserInfo obj) {
        if(StringUtils.isBlank(obj.getUid())){
            obj.setCreateTime(new Date());
            obj.setUid(UuidUtils.getUpperUuid());
        }
        return userInfoDao.save(obj);
    }

    @Override
    public int deleteById(String uid) {
        return 0;
    }

    @Override
    public int deleteById(int uid) {
        return 0;
    }

    @Override
    public int update(UserInfo userInfo) {
        return 0;
    }

    @Override
    public int getTotalCount(UserInfo userInfo) {
        return 0;
    }

    @Override
    public List<UserInfo> queryListPO(int pageIndex, int pageSize, UserInfo userInfo) {
        return null;
    }

    @Override
    public UserInfo getUserInfoByOpenId(String opendId) {
        return  userInfoDao.getUserInfoByOpenId(opendId);
    }

    @Override
    public int updateSubDate(UserInfo userInfo) {
        userInfo.setUpdateTime(new Date());
        return userInfoDao.updateSubDate(userInfo);
    }
}
