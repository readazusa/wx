package club.lovety.yj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 念梓  on 2016/8/2.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@RequestMapping("yj")
@Controller
public class YjController {

    @RequestMapping("goto/yj_page")
    public String yjPage(){
        return "portal/yj/yj_page";
    }


    @RequestMapping("goto/yj_list_page")
    public String yjListPage(){
        return "portal/yj/yj_list_page";
    }

    @RequestMapping("goto/yj_view_edit_page")
    public String yjViewEditPage(){
        return "portal/yj/yj_view_edit_page";
    }

    @RequestMapping("goto/yj_edit_page")
    public String yjEditPage(){
        return "portal/yj/yj_edit_page";
    }

    @RequestMapping("goto/yj_new_page")
    public String yjNewPage(){
        return "portal/yj/yj_new_page";
    }







}
