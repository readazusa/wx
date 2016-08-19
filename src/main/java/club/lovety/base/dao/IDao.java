package club.lovety.base.dao;

import club.lovety.base.entity.BaseSearchPO;

import java.util.List;

/**
 * Created by smc on 2015/11/19.
 * 基础dao
 */
public interface IDao<T> {

    public int save(T obj);   //保存信息

    public int deleteById(String uid);

    public int deleteById(int uid);

    public int update(T t);

    public T  queryObjectById(String id);

    public T queryObjectById(int id);

    public List<T> queryList();

    public int queryTotalCount(T t);    //获取匹配条件的个数

    public List<T> queryPage(BaseSearchPO<T> baseSearchPO);


}
