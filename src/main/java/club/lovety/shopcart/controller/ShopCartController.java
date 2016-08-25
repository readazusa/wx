package club.lovety.shopcart.controller;

import club.lovety.shopcart.service.IShopCartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by 念梓  on 2016/8/15.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:购物车
 */
@RequestMapping("shopcart")
@Controller
public class ShopCartController {

    private static final Logger log = LoggerFactory.getLogger(ShopCartController.class);

    @Resource
    private IShopCartService shopCartService;

    @RequestMapping("index")
    public String index(){
        return null;
    }

    @RequestMapping("list")
    @ResponseBody
    public Object list(){
        return null;
    }


    @RequestMapping("add")
    @ResponseBody
    public Object add(String id) {
        shopCartService.saveItemIdIntoMq(id);
        return null;
    }



}
