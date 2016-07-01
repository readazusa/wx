package club.lovety.portal.dao;

import club.lovety.base.dao.IDao;
import club.lovety.base.entity.BaseSearchPO;
import club.lovety.portal.entity.ItemInfo;

import java.util.List;

/**
 * club.lovety.portal.dao
 * Created by smc
 * date on 2016/4/26.
 * Email:sunmch@163.com
 */
public interface IItemDao extends IDao<ItemInfo>{

    public List<ItemInfo> getPageSearch(BaseSearchPO<ItemInfo> baseSearchPO);
}
