package club.lovety.common;

/**
 * club.lovety.util
 * Created by smc
 * date on 2016/4/14.
 * Email:sunmch@163.com
 * 微信所有的接口url
 */
public class WeChatUrlUtils {

    public static final String REPLACE_STR="ACCESS_TOKEN";

    public  static final String INDEX_URL="http://www.sunmingchun.net/wx/portal/index.htm";

    public static final String MENU_URL= "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";   //自定义菜单链接
    public static final String GXH_MENU_URL="https://api.weixin.qq.com/cgi-bin/menu/addconditional?access_token=ACCESS_TOKEN";  //个性化菜单链接
    public static final String DEL_MENU_URL="https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";  //删除自定义菜单

    public static final String ADD_YJ_SC_URL="https://api.weixin.qq.com/cgi-bin/material/add_news?access_token=ACCESS_TOKEN";  //新增永久图片素材url

    public static final String UPLOAD_YJ_SC_URL="https://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token=ACCESS_TOKEN";  //上传永久图片素材

    public static final String GET_LS_SC_URL="https://api.weixin.qq.com/cgi-bin/media/get?access_token=ACCESS_TOKEN&media_id=MEDIA_ID";   //获取临时素材

    public  static final String JSAPI_TICKET_URL="https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";

    public static final String SEND_TEMPLATE_URL="https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";

    public static final String PAY_FEE_URL="https://api.mch.weixin.qq.com/pay/unifiedorder";  //统一下单url

    public static final String YM_OPENID_URL="https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxf13b2cb7e7db3cb4&secret=877da9e20e85b8809da9628d91dc5a09&code=CODE&grant_type=authorization_code";

    //临时生成二维码的url
    public static final String T_CODE_CREATE_LS_URL="https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=ACCESS_TOKEN";

    //生成永久二维码的url
    public static final String T_CODE_CREATE_YJ_URL="https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=ACCESS_TOKEN";






}
