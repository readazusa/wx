package club.lovety.message.event;

import club.lovety.message.BaseEventMessage;

/**
 * club.lovety.message.event
 * Created by smc
 * date on 2016/4/24.
 * Email:sunmch@163.com
 */
public class LocationEventMessage extends BaseEventMessage {

    private String Latitude;     //	地理位置纬度

    private  String Longitude;       ///	地理位置经度

    private  String Precision;  //	地理位置精度

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

    public String getLatitude() {

        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }
}
