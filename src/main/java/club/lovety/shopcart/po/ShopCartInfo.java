package club.lovety.shopcart.po;

import club.lovety.base.entity.BasePO;

/**
 * Created by 念梓  on 2016/8/15.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public class ShopCartInfo extends BasePO {

    private  String itemId;

    private String nick;   //买家昵称

    private String openId;  //微信对应的openId

    private String title;

    private String picUrl;


    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }


    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}