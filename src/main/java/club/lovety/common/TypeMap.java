package club.lovety.common;

import club.lovety.message.req.*;

import java.util.HashMap;
import java.util.Map;

/**
 * club.lovety.common
 * Created by smc
 * date on 2016/3/23.
 * Email:sunmch@163.com
 */
public final class TypeMap {

    public static final String TEXT_TYPE="text";

    public static  final String IMAGE_TYPE="image";

    public static  final String VOICE_TYPE="voice";

    public static final String VIDEO_TYPE="video";

    public static final String EVENT_TYPE="event";

    public static final String SHORT_VIDEO_TYPE="shortvideo";

    public static final String EVENT_CLICK="CLICK";

    public static final String EVENT_VIEW="VIEW";

    public static final String EVENT_SCANCODE_PUSH="scancode_push";

    public static final String EVENT_SCANCODE_WAITMSG="scancode_waitmsg";

    public static final String EVENT_PIC_SYSPHOTO="pic_sysphoto";

    public  static final String EVENT_PIC_PHOTO_OR_ALBUM="pic_photo_or_album";

    public static final String EVENT_PIC_WEIXIN="pic_weixin";

    public  static final String EVENT_LOCATION_SELECT="location_select";

    public static final String EVENT_SUBSCRIBE="subscribe";

    public static final String EVENT_LOCATION="LOCATION";   //上报地理位置

    public static final Map<String,Class> msgTypeMap = new HashMap<>();

    static {
        msgTypeMap.put(TEXT_TYPE, ReqTextMessage.class);
        msgTypeMap.put(IMAGE_TYPE, ReqImageMessage.class);
        msgTypeMap.put(VOICE_TYPE, ReqVoiceMessage.class);
        msgTypeMap.put(VIDEO_TYPE, ReqVideoMessage.class);
        msgTypeMap.put(SHORT_VIDEO_TYPE, ReqShortVideoMessage.class);
    }

}
