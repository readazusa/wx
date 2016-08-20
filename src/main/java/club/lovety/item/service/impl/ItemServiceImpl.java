package club.lovety.item.service.impl;

import club.lovety.base.entity.BasePagePO;
import club.lovety.base.entity.BaseSearchPO;
import club.lovety.base.entity.LoadBaseSearchUtil;
import club.lovety.item.dao.IItemDao;
import club.lovety.item.entity.ItemInfo;
import club.lovety.item.service.IItemService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 念梓  on 2016/8/18.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@Service
public class ItemServiceImpl implements IItemService {

    @Resource
    private IItemDao itemDao;

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
        return itemDao.queryTotalCount(itemInfo);
    }

    @Override
    public List<ItemInfo> queryListPO(int pageIndex, int pageSize, ItemInfo itemInfo) {
        BaseSearchPO<ItemInfo> baseSearchPO = LoadBaseSearchUtil.getBaseSearch(pageIndex,pageSize,itemInfo);
        return itemDao.queryPage(baseSearchPO);
    }

    @Override
    public BasePagePO<ItemInfo> queryList(HttpServletRequest request) {
        String pageIndexStr = request.getParameter("pageIndex");
        String pageSizeStr = request.getParameter("pageSize");
        int pageSize = StringUtils.isNotBlank(pageSizeStr)?Integer.parseInt(pageSizeStr):10;
        int pageIndex = StringUtils.isNoneBlank(pageIndexStr)?Integer.parseInt(pageIndexStr):1;
        ItemInfo itemInfo = new ItemInfo();
        String search = request.getParameter("search");
        String isIndex = request.getParameter("isIndex");
        String isTj = request.getParameter("isTj");
        itemInfo.setSearch(search);
        itemInfo.setTitle(search);
        itemInfo.setIsTj(isTj);
        itemInfo.setIsIndex(isIndex);
        BasePagePO<ItemInfo> basePagePO = new BasePagePO<>();
        int totalCount = this.getTotalCount(itemInfo);
        List<ItemInfo> itemInfos = this.queryListPO(pageIndex,pageSize,itemInfo);
        basePagePO.setPageSize(pageSize);
        basePagePO.setData(itemInfos);
        basePagePO.setRecordsTotal(totalCount);
        basePagePO.setCurrentPage(pageIndex);
        return basePagePO;
    }






}
