package club.lovety.service;

import club.lovety.message.BaseMessage;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * club.lovety.service
 * Created by smc
 * date on 2016/3/24.
 * Email:sunmch@163.com
 */
public interface IMsgService {

    public String executeMsg(HttpServletRequest request);


}
