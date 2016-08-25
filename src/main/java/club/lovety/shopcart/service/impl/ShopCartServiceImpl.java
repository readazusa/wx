package club.lovety.shopcart.service.impl;

import club.lovety.shopcart.po.ShopCartInfo;
import club.lovety.shopcart.service.IShopCartService;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 念梓  on 2016/8/25.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@Service
public class ShopCartServiceImpl implements IShopCartService {

    @Resource(name = "shopCartJmsTemplate")
    private JmsTemplate jmsTemplate;

    @Override
    public void saveItemIdIntoMq(String itemId) {
        jmsTemplate.convertAndSend(itemId);
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



}
