package club.lovety.item.service.impl;

import club.lovety.item.entity.ItemInfo;
import club.lovety.item.service.IItemService;
import org.springframework.stereotype.Service;

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
