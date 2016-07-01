package club.lovety.message.event;

import java.util.List;

/**
 * club.lovety.message.event
 * Created by smc
 * date on 2016/4/15.
 * Email:sunmch@163.com
 */
public class SendPicsInfoMessage {

    private String Count;

    private PicListMessage PicList;

    public String getCount() {
        return Count;
    }

    public void setCount(String count) {
        Count = count;
    }

    public PicListMessage getPicList() {
        return PicList;
    }

    public void setPicList(PicListMessage picList) {
        PicList = picList;
    }
}
