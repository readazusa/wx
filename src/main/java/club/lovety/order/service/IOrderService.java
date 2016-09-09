package club.lovety.order.service;

import club.lovety.order.entity.BuyItemInfo;

/**
 * Created by 念梓  on 2016/9/8.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public interface IOrderService {



    //点击购买确定，创建订单
    public void setTradeIntoMq(BuyItemInfo buyItemInfo);


    //付款后提交订单
    public void submitTradeInfoMq(BuyItemInfo buyItemInfo);




}
