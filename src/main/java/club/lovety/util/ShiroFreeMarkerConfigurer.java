package club.lovety.util;

import freemarker.template.TemplateException;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.IOException;

/**
 * net.sunmingchun.www.util
 * Created by smc
 * date on 2016/2/25.
 * Email:sunmch@163.com
 * shrio集成到freemarker标签中
 */
public class ShiroFreeMarkerConfigurer extends FreeMarkerConfigurer {
    @Override
    public void afterPropertiesSet() throws IOException, TemplateException {
        super.afterPropertiesSet();
//
//        this.getConfiguration().setSharedVariable("shiro", new ShiroTags());
    }
}
