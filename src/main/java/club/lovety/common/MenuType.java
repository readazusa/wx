package club.lovety.common;

/**
 * club.lovety.util
 * Created by smc
 * date on 2016/4/14.
 * Email:sunmch@163.com
 */
public final class MenuType {

    public static String CLICK="click";  //点击推事件

    public static String VIEW="view";  //跳转URL

    public static String SCANCODE_PUSH="scancode_push"; //扫码推事件

    public static String SCANCODE_WAITMSG= "scancode_waitmsg";  //扫码推事件且弹出“消息接收中”提示框

    public static String PIC_SYSPHOTO="pic_sysphoto";  //弹出系统拍照发图

    public static String PIC_PHOTO_OR_ALBUM="pic_photo_or_album";  //弹出拍照或者相册发图

    public static String PIC_WEIXIN="pic_weixin";  //弹出微信相册发图器

    public static String LOCATION_SELECT="location_select";  //弹出地理位置选择器
}
