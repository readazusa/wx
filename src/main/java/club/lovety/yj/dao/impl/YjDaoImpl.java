package club.lovety.yj.dao.impl;

import club.lovety.base.entity.BaseSearchPO;
import club.lovety.yj.dao.IYjDao;
import club.lovety.yj.entity.YjInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 念梓  on 2016/9/8.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@Repository
public class YjDaoImpl extends SqlSessionDaoSupport implements IYjDao {

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int save(YjInfo obj) {
        return this.getSqlSession().insert("YjInfo.save",obj);
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
    public int update(YjInfo yjInfo) {
        return 0;
    }

    @Override
    public YjInfo queryObjectById(String id) {
        return null;
    }

    @Override
    public YjInfo queryObjectById(int id) {
        return null;
    }

    @Override
    public List<YjInfo> queryList() {
        return null;
    }

    @Override
    public int queryTotalCount(YjInfo yjInfo) {
        return 0;
    }

    @Override
    public List<YjInfo> queryPage(BaseSearchPO<YjInfo> baseSearchPO) {
        return null;
    }

    @Override
    public List<YjInfo> queryListByOpenId(String openId) {
        return this.getSqlSession().selectList("YjInfo.queryListByOpenId",openId);
    }

    @Override
    public YjInfo queryDefaultYjInfoByOpenId(String openId) {
        List<YjInfo> yjInfoList = this.getSqlSession().selectList("YjInfo.queryDefaultYjInfoByOpenId",openId);
        return yjInfoList!=null&&yjInfoList.size()>0?yjInfoList.get(0):null;
    }
}
