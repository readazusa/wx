package club.lovety.portal.service.impl;

import club.lovety.base.entity.BasePagePO;
import club.lovety.base.entity.BaseSearchPO;
import club.lovety.portal.dao.IItemDao;
import club.lovety.portal.entity.ItemInfo;
import club.lovety.portal.service.IItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * club.lovety.portal.service.impl
 * Created by smc
 * date on 2016/4/26.
 * Email:sunmch@163.com
 */
@Service
public class ItemServiceImpl implements IItemService {

    @Resource
    private IItemDao itemDao;

    @Override
    public BasePagePO<ItemInfo> getPageSearch(int pageSize, int pageIndex, String... args) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.setTitle(args[0]);
        itemInfo.setCid(args[1]);
        itemInfo.setTj(args[2]);
        BaseSearchPO<ItemInfo> baseSearchPO = new BaseSearchPO<>();
        baseSearchPO.setObj(itemInfo);
        baseSearchPO.setPageIndex((pageIndex-1)*pageSize);
        baseSearchPO.setPageSize(pageSize);
        List<ItemInfo> itemInfos = itemDao.getPageSearch(baseSearchPO);
        int total = itemDao.queryTotalCount(itemInfo);
        BasePagePO<ItemInfo> basePagePO = new BasePagePO<>();
        basePagePO.setPageSize(pageSize);
        basePagePO.setData(itemInfos);
        basePagePO.setRecordsTotal(total);
        return basePagePO;
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
    public int getTotalCount(ItemInfo itemInfo) {
        return 0;
    }

    @Override
    public List<ItemInfo> queryListPO(int pageIndex, int pageSize, ItemInfo itemInfo) {
        return null;
    }
}
