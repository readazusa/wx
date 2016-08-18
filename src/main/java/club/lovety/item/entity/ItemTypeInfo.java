package club.lovety.item.entity;


import club.lovety.base.entity.BasePO;

/**
 * club.lovety.portal.entity
 * Created by smc
 * date on 2016/4/26.
 * Email:sunmch@163.com
 */
public class ItemTypeInfo extends BasePO {

    private String uid;

    private String name;

    private int deep;

    private String sort;  //排序




    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getDeep() {
        return deep;
    }

    public void setDeep(int deep) {
        this.deep = deep;
    }



}
