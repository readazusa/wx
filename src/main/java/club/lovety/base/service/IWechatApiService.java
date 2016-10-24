package club.lovety.base.service;

import java.io.File;
import java.io.InputStream;
import java.util.Map;

/**
 * club.lovety.base.service
 * Created by smc
 * date on 2016/4/13.
 * Email:sunmch@163.com
 * 微信请求接口api
 */
public interface IWechatApiService {

    public  static final String APP_ID = "wxf13b2cb7e7db3cb4";

    public static final String SECREF="877da9e20e85b8809da9628d91dc5a09";

    public static final String GRANT_TYPE= "client_credential";

    public static final String ACCESS_TOKEN_URL="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxf13b2cb7e7db3cb4&secret=877da9e20e85b8809da9628d91dc5a09";


    /**
     * 获取accesstoken
     * @return
     */
    public String getAccessToken();


    /**
     * 调用微信服务的接口
     * @param url
     * @param paramData
     * @return
     */
    public String doExecute(String url,String paramData);

    public String doExecute(String url,File targetFile);

    public String doExecute(String url,InputStream inputStream);

    public String doPostFormFile(String url,Map<String,File> formFile);

    public String doGet(String url,String contentTpye);

    public String doGet(String url);

    public String createMenu();

    public String getJsApiTicket();

    public String doPost(String url,Object data);





}
