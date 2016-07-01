package club.lovety.portal.dao.impl;

import club.lovety.base.entity.BaseSearchPO;
import club.lovety.portal.dao.IItemDao;
import club.lovety.portal.entity.ItemInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * club.lovety.portal.dao
 * Created by smc
 * date on 2016/4/26.
 * Email:sunmch@163.com
 */
@Repository
public class ItemDaoImpl extends SqlSessionDaoSupport implements IItemDao {

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<ItemInfo> getPageSearch(BaseSearchPO<ItemInfo> baseSearchPO) {
        return this.getSqlSession().selectList(ItemInfo.class.getName()+".queryPage",baseSearchPO);
    }

    @Override
    public int save(ItemInfo obj) {
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
    public int update(ItemInfo itemInfo) {
        return 0;
    }

    @Override
    public ItemInfo queryObjectById(String id) {
        return this.getSqlSession().selectOne(ItemInfo.class.getName()+".queryObjectByUid",id);
    }

    @Override
    public ItemInfo queryObjectById(int id) {
        return null;
    }

    @Override
    public List<ItemInfo> queryList() {
        return null;
    }

    @Override
    public int queryTotalCount(ItemInfo itemInfo) {
        return this.getSqlSession().selectOne(itemInfo.getClass().getName()+".queryPageCount",itemInfo);
    }
}
