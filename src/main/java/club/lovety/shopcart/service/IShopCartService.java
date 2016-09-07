package club.lovety.shopcart.service;

import club.lovety.base.service.IService;
import club.lovety.shopcart.po.ShopCartInfo;

import java.util.List;

/**
 * Created by 念梓  on 2016/8/25.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public interface IShopCartService extends IService<ShopCartInfo>{



    public  void  saveItemIdIntoMq(String itemId,String openId);


    public int getShopCartCountByOpenId(String openId);


    public List<ShopCartInfo> getShopCartByOpenId(String openId);


    public void delShopCartIntoMq(String item,String openId);


}
