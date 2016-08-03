package club.lovety.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("goto/buy_page")
    public String gotoBuyPage(){
        System.out.println("123");
        return "portal/order/buy_page";
    }
}
