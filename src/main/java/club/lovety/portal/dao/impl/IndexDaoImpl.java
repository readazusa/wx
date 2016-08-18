package club.lovety.portal.dao.impl;


import club.lovety.portal.dao.IIndexDao;

import club.lovety.portal.entity.IndexPageInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by 念梓  on 2016/8/17.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@Repository
public class IndexDaoImpl extends SqlSessionDaoSupport implements IIndexDao {

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int save(IndexPageInfo obj) {
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
    public int update(IndexPageInfo indexPageInfo) {
        return 0;
    }

    @Override
    public IndexPageInfo queryObjectById(String id) {
        return null;
    }

    @Override
    public IndexPageInfo queryObjectById(int id) {
        return null;
    }

    @Override
    public List<IndexPageInfo> queryList() {
        return null;
    }

    @Override
    public int queryTotalCount(IndexPageInfo indexPageInfo) {
        return 0;
    }

    @Override
    public List<IndexPageInfo> queryList(IndexPageInfo indexPageInfo) {
        return this.getSqlSession().selectList("IndexPageInfo.queryList",indexPageInfo);
    }
}
