package club.lovety.base.entity;

/**
 * Created by 念梓  on 2016/8/19.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:  获取分页的条件参数工具类
 */
public final class LoadBaseSearchUtil{

    public static<T>  BaseSearchPO getBaseSearch(int pageIndex,int pageSize,T obj){
        BaseSearchPO<T> baseSearchPO = new BaseSearchPO<>();
        baseSearchPO.setPageIndex((pageIndex-1)*pageSize);
        baseSearchPO.setPageSize(pageSize);
        baseSearchPO.setObj(obj);
        return baseSearchPO;
    }

}
