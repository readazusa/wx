package club.lovety.message;

/**
 * club.lovety.message
 * Created by smc
 * date on 2016/3/23.
 * Email:sunmch@163.com
 * 基础的消息处理实体类
 */
public class BaseMessage {

    private  String  ToUserName;

    private String FromUserName;

    private long CreateTime;

    private String MsgType;

    private String Content;

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
