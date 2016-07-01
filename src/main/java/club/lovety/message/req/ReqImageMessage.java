package club.lovety.message.req;

import club.lovety.message.BaseMessage;

/**
 * club.lovety.message.req
 * Created by smc
 * date on 2016/3/23.
 * Email:sunmch@163.com
 * 图片消息实体类
 */
public class ReqImageMessage extends BaseMessage {

    private String PicUrl;   //图片连接

    private String MediaId;  //图片消息媒体id，可以调用多媒体文件下载接口拉取数据。

    private String MsgId;

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getMsgId() {
        return MsgId;
    }

    public void setMsgId(String msgId) {
        MsgId = msgId;
    }
}
