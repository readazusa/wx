package club.lovety.center.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 念梓  on 2016/8/3.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:个人中心
 */
@RequestMapping("center")
@Controller
public class PerCenterController {


    @RequestMapping("goto/index_page")
    public String index(){
        return "portal/center/index_page";
    }


}
