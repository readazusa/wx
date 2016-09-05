package club.lovety.shopcart.dao;

import club.lovety.base.dao.IDao;
import club.lovety.shopcart.po.ShopCartInfo;

import java.util.List;

/**
 * Created by 念梓  on 2016/8/25.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public interface IShopCartDao extends IDao<ShopCartInfo> {

    public  int queryShopCartCountByOpenId(String openId);

    public List<ShopCartInfo> queryListByOpenId(String openId);
}
