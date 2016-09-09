package club.lovety.order.service.impl;

import club.lovety.order.entity.BuyItemInfo;
import club.lovety.order.service.IOrderService;
import club.lovety.util.UuidUtils;
import com.alibaba.fastjson.JSONObject;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 念梓  on 2016/9/8.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@Service
public class OrderServiceImpl implements IOrderService {


    @Resource
    private JmsTemplate jmsTemplate;

    @Override
    public void setTradeIntoMq(BuyItemInfo buyItemInfo) {
        String tradeId = UuidUtils.getUpperUuid();
        buyItemInfo.setTradeId(tradeId);
        jmsTemplate.convertAndSend("happy.shop.item.create.trade", JSONObject.toJSONString(buyItemInfo));
    }

    @Override
    public void submitTradeInfoMq(BuyItemInfo buyItemInfo) {




    }
}
