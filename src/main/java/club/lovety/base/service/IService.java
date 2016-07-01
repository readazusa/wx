package club.lovety.base.service;

import java.util.List;

/**
 * Created by smc on 2015/11/19.
 * 基础service
 */
public interface IService<T> {
    public T queryObjectById(String id);

    public T queryObjectById(int id);

    public List<T> queryList();

    public int save(T obj);   //保存信息

    public int deleteById(String uid);

    public int deleteById(int uid);

    public int update(T t);

    public int getTotalCount(T t);

    public List<T> queryListPO(int pageIndex, int pageSize, T t);


}
