package club.lovety.user.dao.impl;

import club.lovety.user.dao.IAddressInfoDao;
import club.lovety.user.entity.AddressInfo;
import club.lovety.user.entity.UserInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
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
public class AddressInfoDaoImpl extends SqlSessionDaoSupport implements IAddressInfoDao {

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int save(AddressInfo obj) {
        return 0;
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
    public int update(AddressInfo addressInfo) {
        return 0;
    }

    @Override
    public AddressInfo queryObjectById(String id) {
        return null;
    }

    @Override
    public AddressInfo queryObjectById(int id) {
        return null;
    }

    @Override
    public List<AddressInfo> queryList() {
        return null;
    }

    @Override
    public int queryTotalCount(AddressInfo addressInfo) {
        return 0;
    }
}
