package club.lovety.item.controller;

import club.lovety.base.entity.BasePagePO;
import club.lovety.base.entity.WxConfig;
import club.lovety.base.service.IWechatApiService;
import club.lovety.common.Constants;
import club.lovety.common.Result;
import club.lovety.common.WxConfigUtils;
import club.lovety.item.entity.ItemInfo;
import club.lovety.item.service.IItemService;
import club.lovety.portal.serivce.IIndexService;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * club.lovety.portal.controller
 * Created by smc
 * date on 2016/4/25.
 * Email:sunmch@163.com
 */
@Controller
@RequestMapping("item")
public class ItemController {

    private static final Logger log = LoggerFactory.getLogger(ItemController.class);

    @Resource
    private IItemService itemService;


    @RequestMapping("goto/view")
    public String view(@RequestParam("uid") String uid,HttpServletRequest request,ModelMap model){
        return "portal/item/view";
    }

    @RequestMapping("search")
    public String search(HttpServletRequest request,ModelMap model){
        return "portal/item/index";
    }
    @RequestMapping("tj")
    public String tjItem(HttpServletRequest request,ModelMap model){
        return "portal/item/tj";
    }

    /**
     * 跳转天天特价
     * @return
     */
    @RequestMapping("goto/tttj")
    public String gotoTttj(HttpServletRequest request,Model model){
        return "portal/item/tttj";
    }

    /**
     * 首页的商品数据获取
     * @return
     */
    @RequestMapping("index/list")
    @ResponseBody
    public Object indexList(HttpServletRequest request){
        Result result = new Result();
        try{
            BasePagePO<ItemInfo> basePagePO = itemService.queryList(request);
            result.setData(basePagePO);
            result.setCode(Result.SUCCESS);
        }catch (Exception ex){
            result.setCode(Result.ERROR);
            log.error("获取主页的数据列表错误,错误信息如下： ",ex);
        }
        return result;
    }


}
