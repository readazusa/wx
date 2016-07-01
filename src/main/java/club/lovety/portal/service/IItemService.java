package club.lovety.portal.service;

import club.lovety.base.entity.BasePagePO;
import club.lovety.base.service.IService;
import club.lovety.portal.entity.ItemInfo;

/**
 * club.lovety.portal.service
 * Created by smc
 * date on 2016/4/26.
 * Email:sunmch@163.com
 */
public interface IItemService extends IService<ItemInfo> {

    public BasePagePO<ItemInfo> getPageSearch(int pageSize,int pageIndex,String... args);

}
