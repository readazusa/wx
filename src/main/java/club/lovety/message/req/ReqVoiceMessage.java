package club.lovety.message.req;

import club.lovety.message.BaseMessage;

/**
 * club.lovety.message.req
 * Created by smc
 * date on 2016/3/23.
 * Email:sunmch@163.com
 * 语音消息实体类
 */
public class ReqVoiceMessage extends BaseMessage {

    private  String MediaId;  //语音消息媒体id，可以调用多媒体文件下载接口拉取数据。

    private String Format; //语音格式，如amr，speex等

    private String MsgId;  //

    private  String Recognition;


    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getMsgId() {
        return MsgId;
    }

    public void setMsgId(String msgId) {
        MsgId = msgId;
    }

    public String getRecognition() {
        return Recognition;
    }

    public void setRecognition(String recognition) {
        Recognition = recognition;
    }
}
