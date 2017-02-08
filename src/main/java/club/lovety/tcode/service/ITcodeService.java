package club.lovety.tcode.service;

/**
 * Created by ty on 2017/2/8.
 * 二维码生成
 */
public interface ITcodeService {

    /**
     * 创建二维码
     * @param url
     * @return
     */
    public String createTCode(String url);


    public Object downCode(String tickct);



}
