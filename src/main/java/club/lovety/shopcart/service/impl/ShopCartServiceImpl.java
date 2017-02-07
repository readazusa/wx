package club.lovety.shopcart.service.impl;

import club.lovety.shopcart.dao.IShopCartDao;
import club.lovety.shopcart.po.ShopCartInfo;
import club.lovety.shopcart.service.IShopCartService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by 念梓  on 2016/8/25.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@Service
public class ShopCartServiceImpl implements IShopCartService {


//    @Resource
    private JmsTemplate jmsTemplate;

    @Resource
    private IShopCartDao shopCartDao;

    @Value("${happy.shop.shopcart.del}")
    private String shopCartDel;
    @Override
    public void saveItemIdIntoMq(String itemId,String openId) {
        ShopCartInfo shopCartInfo = new ShopCartInfo();
        shopCartInfo.setItemId(itemId);
        shopCartInfo.setOpenId(openId);
        jmsTemplate.convertAndSend(JSONObject.toJSONString(shopCartInfo));
    }

    @Override
    public ShopCartInfo queryObjectById(String id) {
        return null;
    }

    @Override
    public ShopCartInfo queryObjectById(int id) {
        return null;
    }

    @Override
    public List<ShopCartInfo> queryList() {
        return null;
    }

    @Override
    public int save(ShopCartInfo obj) {
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
    public int update(ShopCartInfo shopCartInfo) {
        return 0;
    }

    @Override
    public int getTotalCount(ShopCartInfo shopCartInfo) {
        return 0;
    }

    @Override
    public List<ShopCartInfo> queryListPO(int pageIndex, int pageSize, ShopCartInfo shopCartInfo) {
        return null;
    }


    @Override
    public int getShopCartCountByOpenId(String openId) {
        return shopCartDao.queryShopCartCountByOpenId(openId);
    }

    @Override
    public List<ShopCartInfo> getShopCartByOpenId(String openId) {
        return shopCartDao.queryListByOpenId(openId);
    }

    @Override
    public void delShopCartIntoMq(String itemId, String openId) {
       Assert.hasLength(openId,"openId 不能为空");
          Map<String,String> shopCartMap = new HashMap<>();
         shopCartMap.put("itemId",itemId);
         shopCartMap.put("openId",openId);
        jmsTemplate.convertAndSend(shopCartDel,JSONObject.toJSONString(shopCartMap));
    }
}
