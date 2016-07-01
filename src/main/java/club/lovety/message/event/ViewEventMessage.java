package club.lovety.message.event;

import club.lovety.message.BaseEventMessage;
import club.lovety.message.BaseMessage;

/**
 * club.lovety.message.event
 * Created by smc
 * date on 2016/5/11.
 * Email:sunmch@163.com
 */
public class ViewEventMessage extends BaseEventMessage {

    private String EventKey;

    private String MenuId;

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }
}
