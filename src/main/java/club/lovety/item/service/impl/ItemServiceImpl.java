package club.lovety.item.service.impl;

import club.lovety.base.entity.BasePagePO;
import club.lovety.base.entity.BaseSearchPO;
import club.lovety.base.entity.DbOrderInfo;
import club.lovety.base.entity.LoadBaseSearchUtil;
import club.lovety.item.dao.IItemDao;
import club.lovety.item.entity.ItemInfo;
import club.lovety.item.service.IItemService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
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
        ItemInfo itemInfo = itemDao.queryObjectById(id);
        Assert.notNull(itemInfo, "需要查询的商品id不存在");
        List<String> itemPicUrlList = itemDao.queryItemPicListByItemId(id);
        itemInfo.setPicUrlList(itemPicUrlList);
        return itemInfo;
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
        BaseSearchPO<ItemInfo> baseSearchPO = LoadBaseSearchUtil.getBaseSearch(pageIndex, pageSize, itemInfo);
        return itemDao.queryPage(baseSearchPO);
    }

    @Override
    public List<ItemInfo> queryListPO(int pageIndex, int pageSize, String orderName, String orderValue, ItemInfo itemInfo) {
        BaseSearchPO<ItemInfo> baseSearchPO = LoadBaseSearchUtil.getBaseSearch(pageIndex, pageSize, orderName, orderValue, itemInfo);
        return itemDao.queryPage(baseSearchPO);
    }


    @Override
    public BasePagePO<ItemInfo> queryList(HttpServletRequest request) {
        String pageIndexStr = request.getParameter("pageIndex");
        String pageSizeStr = request.getParameter("pageSize");
        String orderName = request.getParameter("orderName");
        String orderValue = request.getParameter("orderValue");
        int pageSize = StringUtils.isNotBlank(pageSizeStr) ? Integer.parseInt(pageSizeStr) : 10;
        int pageIndex = StringUtils.isNoneBlank(pageIndexStr) ? Integer.parseInt(pageIndexStr) : 1;
        ItemInfo itemInfo = loadSearchCondition(request);
        int totalCount = this.getTotalCount(itemInfo);
        List<ItemInfo> itemInfos = this.queryListPO(pageIndex, pageSize, orderName, orderValue, itemInfo);
        BasePagePO<ItemInfo> basePagePO = loadResultBasePageInfo(itemInfos, totalCount, pageIndex, pageSize);
        return basePagePO;
    }


    private ItemInfo loadSearchCondition(HttpServletRequest request) {
        ItemInfo itemInfo = new ItemInfo();
        String search = request.getParameter("search");
        String isIndex = request.getParameter("isIndex");
        String isTj = request.getParameter("isTj");
        itemInfo.setSearch(search);
        itemInfo.setTitle(search);
        itemInfo.setIsTj(isTj);
        itemInfo.setIsIndex(isIndex);
        return itemInfo;
    }


    private BasePagePO<ItemInfo> loadResultBasePageInfo(List<ItemInfo> itemInfos, int totalCount, int pageIndex, int pageSize) {
        BasePagePO<ItemInfo> basePagePO = new BasePagePO<>();
        basePagePO.setPageSize(pageSize);
        basePagePO.setData(itemInfos);
        basePagePO.setRecordsTotal(totalCount);
        basePagePO.setCurrentPage(pageIndex);
        return basePagePO;
    }

    @Override
    public int getStockByItemId(String id) {
        return this.itemDao.queryItemStockCountByItemId(id);
    }
}
