package club.lovety.order.entity;

/**
 * Created by 念梓  on 2016/9/1.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:购买的商品信息
 */
public class BuyItemInfo {

    private String itemId;

    private  float price;

    private int stock;

    private String title;

    private int buyCount;  // 购买数量

    private int postage;   //快递费用

    private  String sendMethod = "同城配送";  //发货方式 默认：同城配送


    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    public int getPostage() {
        return postage;
    }

    public void setPostage(int postage) {
        this.postage = postage;
    }

    public String getSendMethod() {
        return sendMethod;
    }

    public void setSendMethod(String sendMethod) {
        this.sendMethod = sendMethod;
    }
}
