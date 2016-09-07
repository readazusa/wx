package club.lovety.shopcart.controller;

import club.lovety.common.Result;
import club.lovety.shopcart.po.ShopCartInfo;
import club.lovety.shopcart.service.IShopCartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

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
    public String index(HttpSession session, ModelMap model) {
        String openId = (String) session.getAttribute("openId");
        List<ShopCartInfo> shopCartInfoList = shopCartService.getShopCartByOpenId(openId);
        model.put("shopcarts", shopCartInfoList);
        return "portal/shopcart/shop_cart";
    }

    @RequestMapping("list")
    @ResponseBody
    public Object list() {
        return null;
    }

    @RequestMapping("add")
    @ResponseBody
    public Object add(String id, HttpServletRequest request) {
        Result result = new Result();
        String openId = (String) request.getSession().getAttribute("openId");
        shopCartService.saveItemIdIntoMq(id, openId);
        return result;
    }

    @RequestMapping("shop_cart_count")
    @ResponseBody
    public Object loadShopCartCount(HttpServletRequest request) {
        Result result = new Result();
        try {
            String openId = (String) request.getSession().getAttribute("openId");
            int shopCartCountByOpenId = shopCartService.getShopCartCountByOpenId(openId);
            result.setCode(Result.SUCCESS);
            result.setData(shopCartCountByOpenId);
        } catch (Exception ex) {
            log.error("获取购物车数量失败:: ", ex);
            result.setCode(Result.ERROR);
        }
        return result;
    }


    @RequestMapping("load_shop_cart")
    @ResponseBody
    public Object loadShopCartByOpenId(HttpSession session) {

        Result result = new Result();
        String openId = (String) session.getAttribute("openId");
        try {
            Assert.notNull(openId, "openId不能为空");
            List<ShopCartInfo> shopCartInfoList = shopCartService.getShopCartByOpenId(openId);
            result.setData(shopCartInfoList);
            result.setCode(Result.SUCCESS);
        } catch (Exception ex) {
            result.setCode(Result.ERROR);
            log.error("根据openid： {}，查询购物车信息错误，错误信息：{} ", openId, ex.getMessage());
        }
        return result;
    }

    @RequestMapping("del_shopcart")
    @ResponseBody
    public Object delShopCart(String itemId, HttpServletRequest request) {
        Result result = new Result();
        try {
            String openId = (String) request.getSession().getAttribute("openId");
            shopCartService.delShopCartIntoMq(itemId,openId);
            result.setCode(Result.SUCCESS);
        } catch (Exception ex) {
            result.setCode(Result.ERROR);
            log.error("向mq插入删除购物车信息失败: ",ex);
        }
        return result;
    }


}
