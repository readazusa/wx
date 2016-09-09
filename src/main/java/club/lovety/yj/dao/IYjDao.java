package club.lovety.yj.dao;

import club.lovety.base.dao.IDao;
import club.lovety.yj.entity.YjInfo;

import java.util.List;

/**
 * Created by 念梓  on 2016/9/8.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public interface IYjDao extends IDao<YjInfo> {
    public List<YjInfo> queryListByOpenId(String openId);

    public YjInfo queryDefaultYjInfoByOpenId(String openId);
}
