package club.lovety.order.controller;

import club.lovety.order.entity.BuyItemInfo;
import club.lovety.order.service.IOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 念梓  on 2016/8/2.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@Controller
@RequestMapping("order")
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    @Resource
    private IOrderService orderService;

    //单个商品创建订单
    @RequestMapping(value = "item/create",method = RequestMethod.POST)
    public String ItemCreateOrder(BuyItemInfo buyItemInfo,HttpServletRequest request, ModelMap model){
        orderService.setTradeIntoMq(buyItemInfo);
        model.put("buyItemInfo",buyItemInfo);
        return "portal/order/buy_page";
    }


    //购物车中上传创建订单
    @RequestMapping(value = "shopcart/create",method = RequestMethod.POST)
    public String shopCartCreateOrder(BuyItemInfo buyItemInfo,HttpServletRequest request, ModelMap model){
        model.put("buyItemInfo",buyItemInfo);
        return "portal/order/buy_page";
    }


}
