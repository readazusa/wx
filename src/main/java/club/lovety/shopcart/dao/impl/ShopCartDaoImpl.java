package club.lovety.shopcart.dao.impl;

import club.lovety.base.entity.BaseSearchPO;
import club.lovety.shopcart.dao.IShopCartDao;
import club.lovety.shopcart.po.ShopCartInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 念梓  on 2016/8/25.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@Repository
public class ShopCartDaoImpl extends SqlSessionDaoSupport implements IShopCartDao {

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int save(ShopCartInfo obj) {
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
    public int update(ShopCartInfo shopCartInfo) {
        return 0;
    }

    @Override
    public ShopCartInfo queryObjectById(String id) {
        return null;
    }

    @Override
    public ShopCartInfo queryObjectById(int id) {
        return null;
    }

    @Override
    public List<ShopCartInfo> queryList() {
        return null;
    }

    @Override
    public int queryTotalCount(ShopCartInfo shopCartInfo) {
        return 0;
    }

    @Override
    public List<ShopCartInfo> queryPage(BaseSearchPO<ShopCartInfo> baseSearchPO) {
        return null;
    }

    @Override
    public int queryShopCartCountByOpenId(String openId) {

        return this.getSqlSession().selectOne("ShopCartInfo.queryShopCartCountByOpenId",openId);
    }

    @Override
    public List<ShopCartInfo> queryListByOpenId(String openId) {
        return this.getSqlSession().selectOne("ShopCartInfo.queryListByOpenId",openId);
    }
}
