package club.lovety.common;

/**
 * club.lovety.common
 * Created by smc
 * date on 2016/4/15.
 * Email:sunmch@163.com
 */
public enum EventType {

    VIEW("VIEW"),    //点击菜单拉取消息时的事件推送

    CLICK("CLICK"),  //点击菜单跳转链接时的事件推送

    scancode_push("scancode_push"),  //扫码推事件的事件推送

    scancode_waitmsg("scancode_waitmsg"),  //扫码推事件且弹出“消息接收中”提示框的事件推送

    pic_sysphoto("pic_sysphoto"),  //弹出系统拍照发图的事件推送

    pic_photo_or_album("pic_photo_or_album"),  //弹出拍照或者相册发图的事件推送

    pic_weixin("pic_weixin"),   //弹出微信相册发图器的事件推送

    location_select("location_select");  //弹出地理位置选择器的事件推送

    private String value;

    EventType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String getValue(){
        return value;
    }
}
