package club.lovety.message.event;

import club.lovety.message.BaseEventMessage;

/**
 * club.lovety.message.event
 * Created by smc
 * date on 2016/3/24.
 * Email:sunmch@163.com
 * 订阅与取消订阅实体类
 */
public class ZcEventMessage extends BaseEventMessage {

    private String EventKey;  //事件KEY值，是一个32位无符号整数，即创建二维码时的二维码scene_id

    private String Ticket;  //二维码的ticket，可用来换取二维码图片

    private String Latitude;  //地理位置纬度

    private String Longitude;  //地理位置经度

    private String Precision;	//地理位置精度

    private String MenuId;  //指菜单ID，如果是个性化菜单，则可以通过这个字段，知道是哪个规则的菜单被点击了。

    private  String ScanCodeInfo;  //扫描信息

    private String ScanType; //	扫描类型，一般是qrcode

    private String ScanResult;  //	扫描结果，即二维码对应的字符串信息

    private SendPicsInfoMessage SendPicsInfo;  //发送的图片信息

    private String SendLocationInfo; //	发送的位置信息

    private String Location_X;	//X坐标信息

    private String Location_Y; 	//Y坐标信息

    private String Scale;	//精度，可理解为精度或者比例尺、越精细的话 scale越高

    private String Label;   //地理位置的字符串信息

    private String Poiname;  //	朋友圈POI的名字，可能为空


    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getPrecision() {
        return Precision;
    }

    public void setPrecision(String precision) {
        Precision = precision;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }

    public String getScanCodeInfo() {
        return ScanCodeInfo;
    }

    public void setScanCodeInfo(String scanCodeInfo) {
        ScanCodeInfo = scanCodeInfo;
    }

    public String getScanType() {
        return ScanType;
    }

    public void setScanType(String scanType) {
        ScanType = scanType;
    }

    public String getScanResult() {
        return ScanResult;
    }

    public void setScanResult(String scanResult) {
        ScanResult = scanResult;
    }

    public SendPicsInfoMessage getSendPicsInfo() {
        return SendPicsInfo;
    }

    public void setSendPicsInfo(SendPicsInfoMessage sendPicsInfo) {
        SendPicsInfo = sendPicsInfo;
    }

    public String getSendLocationInfo() {
        return SendLocationInfo;
    }

    public void setSendLocationInfo(String sendLocationInfo) {
        SendLocationInfo = sendLocationInfo;
    }

    public String getLocation_X() {
        return Location_X;
    }

    public void setLocation_X(String location_X) {
        Location_X = location_X;
    }

    public String getLocation_Y() {
        return Location_Y;
    }

    public void setLocation_Y(String location_Y) {
        Location_Y = location_Y;
    }

    public String getScale() {
        return Scale;
    }

    public void setScale(String scale) {
        Scale = scale;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public String getPoiname() {
        return Poiname;
    }

    public void setPoiname(String poiname) {
        Poiname = poiname;
    }
}
