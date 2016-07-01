package club.lovety.portal.controller;

import club.lovety.base.entity.BasePagePO;
import club.lovety.portal.entity.ItemInfo;
import club.lovety.portal.service.IItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * club.lovety.portal.controller
 * Created by smc
 * date on 2016/4/16.
 * Email:sunmch@163.com
 */
@Controller
@RequestMapping("portal")
public class PortalIndexController {

    @Resource
    private IItemService itemService;

    @RequestMapping("index")
    public String index(HttpServletRequest request,ModelMap model){
//        BasePagePO<ItemInfo> basePagePO = itemService.getPageSearch(10,1,"","");
//        model.put("basePageItem",basePagePO);
        return "portal/index";
    }

    @RequestMapping("cart")
    public String cart(HttpServletRequest request,ModelMap model){



        return null;
    }













}
