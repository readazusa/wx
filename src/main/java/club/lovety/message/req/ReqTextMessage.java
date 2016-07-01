package club.lovety.message.req;

import club.lovety.message.BaseMessage;

/**
 * club.lovety.message.req
 * Created by smc
 * date on 2016/3/23.
 * Email:sunmch@163.com
 * 文本消息实体类
 */
public class ReqTextMessage extends BaseMessage {

    private String MsgId;

    public String getMsgId() {
        return MsgId;
    }

    public void setMsgId(String msgId) {
        MsgId = msgId;
    }
}
