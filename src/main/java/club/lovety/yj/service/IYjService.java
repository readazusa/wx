package club.lovety.yj.service;

import club.lovety.base.service.IService;
import club.lovety.yj.entity.YjInfo;

import java.util.List;

/**
 * Created by 念梓  on 2016/9/8.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public interface IYjService extends IService<YjInfo> {


    /**
     * 获取邮寄信息的列表
     * @param openId
     * @return
     */
    public List<YjInfo> queryListByOpenId(String openId);

    public YjInfo queryDefaultYjInfoByOpenId(String openId);




}
