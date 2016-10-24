package club.lovety.base.service.impl;

import club.lovety.base.entity.AccessTokenJson;
import club.lovety.base.entity.JsApiTicketJson;
import club.lovety.base.service.IWechatApiService;
import club.lovety.cache.service.BaseCacheService;
import club.lovety.common.MenuType;
import club.lovety.common.WeChatUrlUtils;
import club.lovety.message.menu.MenuButton;
import club.lovety.message.menu.WechatMenu;
import club.lovety.util.HttpUtils;
import club.lovety.util.UuidUtils;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * club.lovety.base.service.impl
 * Created by smc
 * date on 2016/4/13.
 * Email:sunmch@163.com
 */
@Service
public class WechatApiServiceImpl implements IWechatApiService {

    public static final String ACCESS_TOKEN_KEY = "wechat:access_token";

    public static final String JSAPI_TICKET_KEY = "wechat:jaspi_ticket";

    private static final Logger log = LoggerFactory.getLogger(WechatApiServiceImpl.class);

    @Resource
    private BaseCacheService baseCacheService;

    @Override
    public String getAccessToken() {
        String access_token = baseCacheService.get(ACCESS_TOKEN_KEY);
        if (StringUtils.isBlank(access_token)) {
            synchronized (this) {
                access_token = baseCacheService.get(ACCESS_TOKEN_KEY);
                if (StringUtils.isNotBlank(access_token)) {     //防止多个现场获取access_token 冲突,多线程获取的时候首先在redis中获取
                    return access_token;
                }
                String accessTokenJsonStr = HttpUtils.getInstance().get(ACCESS_TOKEN_URL);
                log.debug("接口请求获取access_token: {}", accessTokenJsonStr);
                AccessTokenJson accessTokenJson = JSON.parseObject(accessTokenJsonStr, AccessTokenJson.class);
                if (StringUtils.isNotBlank(accessTokenJson.getAccess_token())) {
                    access_token = accessTokenJson.getAccess_token();
                    baseCacheService.set(ACCESS_TOKEN_KEY, access_token, 7000L);
                } else {
                    for (int i = 0; i < 5; i++) {
                        accessTokenJsonStr = HttpUtils.getInstance().get(ACCESS_TOKEN_URL);
                        accessTokenJson = JSON.parseObject(accessTokenJsonStr, AccessTokenJson.class);
                        if (StringUtils.isNotBlank(accessTokenJson.getAccess_token())) {
                            access_token = accessTokenJson.getAccess_token();
                            baseCacheService.set(ACCESS_TOKEN_KEY, access_token, 7000L);
                            break;
                        } else {
                            try {
                                Thread.sleep(500L);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
        return access_token;
    }

    @Override
    public String doExecute(String url, String paramData) {
        log.debug("请求api的json数据: {}", paramData);
        String access_token = getAccessToken();
        url = url.replace("ACCESS_TOKEN", access_token);
        String result = HttpUtils.getInstance().post(url, paramData);
        log.debug("调用api地址：{}，返回结果:{}", url, result);
        return result;
    }

    @Override
    public String doExecute(String url, File targetFile) {
        log.debug("请求api的json数据: {}", targetFile);
//        String access_token = getAccessToken();
//        url = url.replace("ACCESS_TOKEN", access_token);
        url = getUrl(url);
        String result = HttpUtils.getInstance().post(url, targetFile);
        log.debug("调用api地址：{}，返回结果:{}", url, result);
        return result;
    }

    @Override
    public String doExecute(String url, InputStream inputStream) {
        return null;
    }

    @Override
    public String doPost(String url, Object data) {
        String access_token = getAccessToken();
        url = url.replace("ACCESS_TOKEN", access_token);
        String result = HttpUtils.getInstance().post(url, data);
        log.debug("调用api地址：{}，返回结果:{}", url, result);
        return result;
    }
    private String getUrl(String url){
        String access_token = getAccessToken();
        url = url.replace("ACCESS_TOKEN", access_token);
        return url;
    }

    @Override
    public String doGet(String url) {
        String access_token = getAccessToken();
        url = url.replace("ACCESS_TOKEN", access_token);
        String result = HttpUtils.getInstance().get(url);
        log.debug("get请求返回结果: {}", result);
        return result;
    }

    @Override
    public String doGet(String url, String contentTpye) {
        log.debug("请求api的contentType数据: {}", contentTpye);
        String access_token = getAccessToken();
        url = url.replace("ACCESS_TOKEN", access_token);
        String result = HttpUtils.getInstance().get(url, contentTpye);
        log.debug("调用api地址：{}，返回结果:{}", url, result);
        return result;
    }

    @Override
    public String doPostFormFile(String url, Map<String, File> formFile) {
        log.debug("请求api的formFile数据: {}", formFile);
        String access_token = getAccessToken();
        url = url.replace("ACCESS_TOKEN", access_token);
        String result = HttpUtils.getInstance().postFormFile(url, formFile);
        log.debug("调用api地址：{}，返回结果:{}", url, result);
        return result;
    }

    @Override
    public String createMenu() {
        log.debug("测试新建菜单:{} ", new Date());
        String menuKey = "wechat:menu:key";
        String menuJson = baseCacheService.get(menuKey);
        log.debug("redisz中获取的创建菜单数据: {}", menuJson);

        if (StringUtils.isBlank(menuJson)) {
            doExecute(WeChatUrlUtils.DEL_MENU_URL, " ");
            WechatMenu wechatMenu = new WechatMenu();
            List<MenuButton> menuButtons = new ArrayList<>();
            //第一菜单
            MenuButton menuButtonCd = new MenuButton();
            menuButtonCd.setName("菜单");
            menuButtonCd.setKey("cd_" + UuidUtils.getUpperUuid());
            List<MenuButton> cdSubbutton = new ArrayList<>();
            MenuButton cdSubbuttonOne = new MenuButton();
            cdSubbuttonOne.setName("搜索");
            cdSubbuttonOne.setUrl("http://www.baidu.com");
            cdSubbuttonOne.setType(MenuType.VIEW);

            MenuButton cdSubbuttonTwo = new MenuButton();
            cdSubbuttonTwo.setName("新闻");
            cdSubbuttonTwo.setUrl("http://www.qq.com/?pgv_ref=aio2015");
            cdSubbuttonTwo.setType(MenuType.VIEW);

            MenuButton cdSubbuttonThree = new MenuButton();
            cdSubbuttonThree.setName("店铺");
            cdSubbuttonThree.setUrl(WeChatUrlUtils.INDEX_URL);
            cdSubbuttonThree.setType(MenuType.VIEW);

            cdSubbutton.add(cdSubbuttonOne);
            cdSubbutton.add(cdSubbuttonTwo);
            cdSubbutton.add(cdSubbuttonThree);

            menuButtonCd.setSub_button(cdSubbutton);
            menuButtons.add(menuButtonCd);
            //第二菜单
            MenuButton menuButtonPic = new MenuButton();
            menuButtonPic.setName("选择图片");
            menuButtonPic.setType(MenuType.PIC_PHOTO_OR_ALBUM);
            menuButtonPic.setKey("pic_" + UuidUtils.getUpperUuid());
            menuButtons.add(menuButtonPic);
            //第三菜单
            MenuButton menuButtonHelp = new MenuButton();
            menuButtonHelp.setName("帮助文档");
            menuButtonHelp.setType(MenuType.CLICK);
            menuButtonHelp.setKey("click_" + UuidUtils.getUpperUuid());
            menuButtons.add(menuButtonHelp);
            /**
             * 添加到菜单
             */
            wechatMenu.setButton(menuButtons);
            menuJson = JSON.toJSONString(wechatMenu);
            log.debug("新创建的菜单内容： {}", menuJson);
            baseCacheService.setDay(menuKey, menuJson, 15);
            return doExecute(WeChatUrlUtils.MENU_URL, menuJson);
        }
        return null;
    }

    @Override
    public String getJsApiTicket() {
        String access_token = getAccessToken();
        String jsapi_ticket = baseCacheService.get(JSAPI_TICKET_KEY);
        if (StringUtils.isBlank(jsapi_ticket)) {
            synchronized (this) {
                jsapi_ticket = baseCacheService.get(JSAPI_TICKET_KEY);
                if (StringUtils.isNotBlank(jsapi_ticket)) {     //防止多个现场获取jsapi_ticket 冲突,多线程获取的时候首先在redis中获取
                    return jsapi_ticket;
                }
                String jsApiTicketUrl = WeChatUrlUtils.JSAPI_TICKET_URL.replace(WeChatUrlUtils.REPLACE_STR, access_token);
                String jsApiTicketJsonStr = HttpUtils.getInstance().get(jsApiTicketUrl);
                log.debug("jsApiTicket: {}", jsApiTicketJsonStr);
                JsApiTicketJson jsApiTicketJson = JSON.parseObject(jsApiTicketJsonStr, JsApiTicketJson.class);
                if (StringUtils.isNotBlank(jsApiTicketJson.getTicket())) {
                    jsapi_ticket = jsApiTicketJson.getTicket();
                    baseCacheService.set(JSAPI_TICKET_KEY, jsapi_ticket, 7000L);
                } else {
                    for (int i = 0; i < 5; i++) {
                        jsApiTicketJsonStr = HttpUtils.getInstance().get(ACCESS_TOKEN_URL);
                        jsApiTicketJson = JSON.parseObject(jsApiTicketJsonStr, JsApiTicketJson.class);
                        if (StringUtils.isNotBlank(jsApiTicketJson.getTicket())) {
                            jsapi_ticket = jsApiTicketJson.getTicket();
                            baseCacheService.set(JSAPI_TICKET_KEY, jsapi_ticket, 7000L);
                            break;
                        } else {
                            try {
                                Thread.sleep(500L);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
        return jsapi_ticket;
    }
}
