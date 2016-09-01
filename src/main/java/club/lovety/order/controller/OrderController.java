package club.lovety.order.controller;

import club.lovety.order.entity.BuyItemInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "goto/buy_page",method = RequestMethod.POST)
    public String gotoBuyPage(BuyItemInfo buyItemInfo, ModelMap model){
        model.put("buyItemInfo",buyItemInfo);
        return "portal/order/buy_page";
    }

    @RequestMapping("create")
    public String buyOrder(){
        return null;
    }



    @RequestMapping("goto/all_page")
    public String allPage(){
        return "portal/order/all_page";
    }

    @RequestMapping("goto/shop_cart")
    public String shopCart(){
        return "portal/order/shop_cart";
    }
}
