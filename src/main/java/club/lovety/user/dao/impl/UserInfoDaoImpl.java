package club.lovety.user.dao.impl;

import club.lovety.base.entity.BaseSearchPO;
import club.lovety.user.dao.IUserInfoDao;
import club.lovety.user.entity.UserInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * club.lovety.user.dao.impl
 * Created by smc
 * date on 2016/4/19.
 * Email:sunmch@163.com
 */
@Repository
public class UserInfoDaoImpl extends SqlSessionDaoSupport implements IUserInfoDao {

    private static final Logger log = LoggerFactory.getLogger(UserInfoDaoImpl.class);
    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int save(UserInfo obj) {
        return this.getSqlSession().insert("club.lovety.user.entity.UserInfo.save",obj);
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
    public int queryTotalCount(UserInfo userInfo) {
        return 0;
    }

    @Override
    public UserInfo getUserInfoByOpenId(String openId) {
        return this.getSqlSession().selectOne("club.lovety.user.entity.UserInfo.queryUserInfoByOpenId", openId);
    }

    @Override
    public int updateSubDate(UserInfo userInfo) {
        return this.getSqlSession().selectOne("club.lovety.user.entity.UserInfo.updateSubDate",userInfo);
    }

    @Override
    public List<UserInfo> queryPage(BaseSearchPO<UserInfo> baseSearchPO) {
        return null;
    }
}
