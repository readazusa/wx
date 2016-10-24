package club.lovety.yj.controller;

import club.lovety.common.Result;
import club.lovety.yj.entity.YjInfo;
import club.lovety.yj.service.IYjService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 念梓  on 2016/8/2.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des: 邮寄信息处理类
 */
@RequestMapping("yj")
@Controller
public class YjController {

    private static final Logger log = LoggerFactory.getLogger(YjController.class);

    @Resource
    private IYjService yjService;

    @RequestMapping("goto/yj_page")
    public String yjPage(HttpServletRequest request, ModelMap model) {
        List<YjInfo> yjInfoList = this.loadYjInfoList(request);
        model.put("yjInfos", yjInfoList);
        return "portal/yj/yj_page";
    }


    @RequestMapping("goto/yj_list_page")
    public String yjListPage(HttpServletRequest request, ModelMap model) {
        List<YjInfo> yjInfoList = this.loadYjInfoList(request);
        model.put("yjInfos", yjInfoList);
        return "portal/yj/yj_list_page";
    }

    @RequestMapping("goto/yj_view_edit_page")
    public String yjViewEditPage() {
        return "portal/yj/yj_view_edit_page";
    }

    @RequestMapping("goto/yj_edit_page")
    public String yjEditPage() {
        return "portal/yj/yj_edit_page";
    }

    @RequestMapping("goto/yj_new_page")
    public String yjNewPage() {
        return "portal/yj/yj_new_page";
    }

    @RequestMapping("add")
    @ResponseBody
    public Object add(YjInfo yjInfo,HttpServletRequest request){
        Result result = new Result();
        try{
            yjService.save(yjInfo);
            result.setSucc(Result.SUCC);
        }catch (Exception ex){
            log.error("保存邮寄地址信息错误: ",ex);
            result.setSucc(result.FAIL);
        }
        return result;
    }


    @RequestMapping("load_default_yj")
    @ResponseBody
    public Object loadDefaultYjInfo() {
        return null;
    }

    private List<YjInfo> loadYjInfoList(HttpServletRequest request) {
        String openId = (String) request.getSession().getAttribute("openId");
        List<YjInfo> yjInfoList = yjService.queryListByOpenId(openId);
        return yjInfoList;
    }


}
