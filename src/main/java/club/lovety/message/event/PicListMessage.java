package club.lovety.message.event;

import java.util.List;

/**
 * club.lovety.message.event
 * Created by smc
 * date on 2016/4/15.
 * Email:sunmch@163.com
 */
public class PicListMessage {

    private List<ItemMessage> item;

    public List<ItemMessage> getItem() {
        return item;
    }

    public void setItem(List<ItemMessage> item) {
        this.item = item;
    }
}
