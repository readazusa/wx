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
@RequestMapping("test1/vue")
public class VueController3 {
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
}
