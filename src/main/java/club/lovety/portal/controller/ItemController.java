package club.lovety.portal.controller;

import club.lovety.base.entity.BasePagePO;
import club.lovety.base.entity.WxConfig;
import club.lovety.base.service.IWechatApiService;
import club.lovety.common.Constants;
import club.lovety.common.WxConfigUtils;
import club.lovety.portal.entity.ItemInfo;
import club.lovety.portal.service.IItemService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @Resource
    private IWechatApiService wechatApiService;

    @RequestMapping("view")
    public String view(@RequestParam("uid") String uid,HttpServletRequest request,ModelMap model){
        model.put("uid",uid);
        String query = request.getQueryString();
        StringBuffer sb = request.getRequestURL();
        String url = sb.append("?").append(query).toString();
        log.debug("前台请求的url： {}",url);
        String jsapiTicket = wechatApiService.getJsApiTicket();
        log.debug("jsapiticket: {}",jsapiTicket);
        log.debug("jsurl: {}",Constants.PORTAL_JSSDK_URL);
        WxConfig wxConfig = WxConfigUtils.getWxConfig(Constants.PORTAL_JSSDK_URL,jsapiTicket);
        log.debug("wxConfig: {}",wxConfig.toString());
        model.put("wxConfig",wxConfig);
        return "portal/item/view";
    }

    @RequestMapping("search")
    public String search(HttpServletRequest request,ModelMap model){
        String pageSizeS = request.getParameter("pageSize");
        String pageIndexS = request.getParameter("pageIndex");
        int pageSize =10;
        int pageIndex =1;
        if(StringUtils.isNoneBlank(pageSizeS)){
            pageSize = Integer.parseInt(pageSizeS);
        }
        if(StringUtils.isNotBlank(pageIndexS)){
            pageIndex = Integer.parseInt(pageIndexS);
        }
        String title = request.getParameter("title");
        String cid = request.getParameter("cid");
        BasePagePO<ItemInfo> basePagePO = itemService.getPageSearch(pageSize,pageIndex,title,cid,null);
        model.put("basePageItem",basePagePO);
        return "portal/item/index";
    }

    @RequestMapping("tj")
    public String tjItem(HttpServletRequest request,ModelMap model){
        String pageSizeS = request.getParameter("pageSize");
        String pageIndexS = request.getParameter("pageIndex");
        int pageSize =10;
        int pageIndex =1;
        if(StringUtils.isNoneBlank(pageSizeS)){
            pageSize = Integer.parseInt(pageSizeS);
        }
        if(StringUtils.isNotBlank(pageIndexS)){
            pageIndex = Integer.parseInt(pageIndexS);
        }
        String title = request.getParameter("title");
        String cid = request.getParameter("cid");
        BasePagePO<ItemInfo> basePagePO = itemService.getPageSearch(pageSize,pageIndex,title,cid,"0");
        model.put("basePageItem",basePagePO);
        return "portal/item/tj";
    }





}
