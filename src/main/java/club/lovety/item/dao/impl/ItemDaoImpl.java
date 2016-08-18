package club.lovety.item.dao.impl;

import club.lovety.item.dao.IItemDao;
import club.lovety.item.entity.ItemInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 念梓  on 2016/8/18.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@Repository
public class ItemDaoImpl extends SqlSessionDaoSupport implements IItemDao {

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
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
        return null;
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
        return 0;
    }
}
