package club.lovety.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * net.sunmingchun.www.util
 * Created by smc
 * date on 2016/3/9.
 * Email:sunmch@163.com
 * md5 或者har加密
 */
public class SecUtils {


    public  static String  getMD5(String source){
        return DigestUtils.md5Hex(source);
    }

    public  static String getSha1(String source){
        return DigestUtils.sha1Hex(source);
    }

    public static void main(String[] args) {
        System.out.println(getMD5("123"));
    }

}
