package club.lovety.interceptor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;

/**
 * 拦截openId为空的数据
 * 跳转到授权页面
 */
public class WxSystemInterceptor extends HandlerInterceptorAdapter {

    /**
     * 微信的授权url
     */
    private static  final String WX_OAUTH_URL="https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxf13b2cb7e7db3cb4&redirect_uri=REDIRECT_URI&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect";

    private  static  final Logger log  = LoggerFactory.getLogger(WxSystemInterceptor.class);

    private String url = "http://www.sunmingchun.net/oauth/code.htm";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

    }
    /**
     * @param request
     * @param response
     * @param handler  (org.springframework.web.method.HandlerMethod)
     * @return
     * request.getHeader("user-agent");  获得请求头的参数
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
////        String url = "http://www.sunmingchun.net:8080/oauth/code.htm";
//        //REDIRECT_URI
        boolean interceptorBool = true;
        log.debug("请求的url: {}",request.getRequestURI());
        log.debug("付款走拦截器的操作，转码之前的url: {}",url);
//        url = URLEncoder.encode(url, "UTF-8");
        String encoderUrl =  URLEncoder.encode(url, "UTF-8");
        log.debug("编码后的uri: {}",url);
        Object openIdObj = request.getSession().getAttribute("openId");
        log.debug("获取session中的openid: {}",openIdObj);
        if(null == openIdObj){
            String oauthUrl = WX_OAUTH_URL.replace("REDIRECT_URI",encoderUrl);
            log.debug("请求的授权uri: {}",oauthUrl);
            response.sendRedirect(oauthUrl);
            interceptorBool = false;
        }
       return interceptorBool;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
