package club.lovety.item.dao;

import club.lovety.base.dao.IDao;
import club.lovety.item.entity.ItemInfo;

import java.util.List;

/**
 * Created by 念梓  on 2016/8/18.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public interface IItemDao extends IDao<ItemInfo> {

    /**
     * 根据商品id获取商品图片信息
     * @param itemId
     * @return
     */
    public List<String>  queryItemPicListByItemId(String itemId);
}
