package club.lovety.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 念梓  on 2016/7/6.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@Controller
@RequestMapping("test/vue")
public class VueController {


    @RequestMapping("index")
    public String index(){
        System.out.println(1222);
        return "test/vue/index";
    }

    @RequestMapping("second")
    public String second(){
        System.out.println(122222);
        return "test/vue/second";
    }


    @RequestMapping("three")
    public String three(){
        System.out.println(122222);
        return "test/vue/three";
    }

    @RequestMapping("template")
    public String tempate(){
        return "test/vue/template";
    }

    @RequestMapping("one")
    public String templateOne(){
        return "test/vue/one";
    }

}
