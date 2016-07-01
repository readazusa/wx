package club.lovety.user.dao.impl;

import club.lovety.user.dao.IUserParticleDao;
import club.lovety.user.entity.UserParticle;
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
public class UserParticleDaoImpl extends SqlSessionDaoSupport implements IUserParticleDao {

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int save(UserParticle obj) {
        return this.getSqlSession().insert("club.lovety.user.entity.UserParticle.save",obj);
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
    public int update(UserParticle userParticle) {
        return 0;
    }

    @Override
    public UserParticle queryObjectById(String id) {
        return null;
    }

    @Override
    public UserParticle queryObjectById(int id) {
        return null;
    }

    @Override
    public List<UserParticle> queryList() {
        return null;
    }

    @Override
    public int queryTotalCount(UserParticle userParticle) {
        return 0;
    }
}
