package club.lovety.yj.service.impl;

import club.lovety.util.UuidUtils;
import club.lovety.yj.dao.IYjDao;
import club.lovety.yj.entity.YjInfo;
import club.lovety.yj.service.IYjService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by 念梓  on 2016/9/8.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@Service
public class YjServiceImpl implements IYjService {

    @Resource
    private IYjDao yjDao;

    @Override
    public YjInfo queryObjectById(String id) {
        return null;
    }

    @Override
    public YjInfo queryObjectById(int id) {
        return null;
    }

    @Override
    public List<YjInfo> queryList() {
        return null;
    }

    @Override
    public int save(YjInfo obj) {
        Date saveInfoDate = new Date();
        obj.setUpdateTime(saveInfoDate);
        obj.setCreateTime(saveInfoDate);
        obj.setId(UuidUtils.getUpperUuid());
        return yjDao.save(obj);
    }

    @Override
    public int deleteById(String uid) {
        return 0;
    }

    @Override
    public int deleteById(int uid) {
        return 0;
    }

    @Override
    public int update(YjInfo yjInfo) {
        return 0;
    }

    @Override
    public int getTotalCount(YjInfo yjInfo) {
        return 0;
    }

    @Override
    public List<YjInfo> queryListPO(int pageIndex, int pageSize, YjInfo yjInfo) {
        return null;
    }

    @Override
    public List<YjInfo> queryListByOpenId(String openId) {
        return yjDao.queryListByOpenId(openId);
    }

    @Override
    public YjInfo queryDefaultYjInfoByOpenId(String openId) {
        return yjDao.queryDefaultYjInfoByOpenId(openId);
    }
}
