package club.lovety.portal.controller;

import club.lovety.portal.entity.IndexPageInfo;
import club.lovety.portal.serivce.IIndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * club.lovety.portal.controller
 * Created by smc
 * date on 2016/4/16.
 * Email:sunmch@163.com
 */
@Controller
@RequestMapping("portal")
public class PortalIndexController {

    private static final Logger log = LoggerFactory.getLogger(PortalIndexController.class);


    @Resource
    private IIndexService indexService;


    @RequestMapping("index")
    public String index(HttpServletRequest request,ModelMap model){
        IndexPageInfo indexPageInfo = new IndexPageInfo();
        indexPageInfo.setType("0");
        indexPageInfo.setIsShow("0");
        try{
            List<IndexPageInfo> indexPageInfos = indexService.queryList(indexPageInfo);
            model.put("indexPageInfoList",indexPageInfos);
        }catch (Exception ex){
            log.error("查询表头失败: ",ex);
        }
        return "portal/index";
    }

    @RequestMapping("cart")
    public String cart(HttpServletRequest request,ModelMap model){

        return null;
    }













}
