package club.lovety.message.req;

import club.lovety.message.BaseMessage;

/**
 * club.lovety.message.req
 * Created by smc
 * date on 2016/3/23.
 * Email:sunmch@163.com
 * 小视频实体类
 */
public class ReqShortVideoMessage extends BaseMessage {

    private String MediaId;

    private String ThumbMediaId;

    private String MsgId;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }

    public String getMsgId() {
        return MsgId;
    }

    public void setMsgId(String msgId) {
        MsgId = msgId;
    }
}
