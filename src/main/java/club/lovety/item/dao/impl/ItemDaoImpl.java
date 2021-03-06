package club.lovety.item.dao.impl;

import club.lovety.base.entity.BaseSearchPO;
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
        List<ItemInfo> itemInfos = this.getSqlSession().selectList("ItemInfo.select",id);
        return itemInfos.size()>0?itemInfos.get(0):null;
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
        return this.getSqlSession().selectOne("ItemInfo.queryTotalCount",itemInfo);
    }

    @Override
    public List<ItemInfo> queryPage(BaseSearchPO<ItemInfo> baseSearchPO) {
        return this.getSqlSession().selectList("ItemInfo.queryPage",baseSearchPO);
    }

    @Override
    public List<String> queryItemPicListByItemId(String itemId) {
        return this.getSqlSession().selectList("FilePO.queryItemPicListByItemId",itemId);
    }

    @Override
    public int queryItemStockCountByItemId(String id) {
        return this.getSqlSession().selectOne("ItemInfo.queryItemStockCountByItemId",id);
    }
}
