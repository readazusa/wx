package club.lovety.user.service.impl;

import club.lovety.user.dao.IUserParticleDao;
import club.lovety.user.entity.UserParticle;
import club.lovety.user.service.IUserParticleService;
import club.lovety.util.UuidUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * club.lovety.user.service.impl
 * Created by smc
 * date on 2016/4/19.
 * Email:sunmch@163.com
 */
@Service
public class UserParticleServiceImpl implements IUserParticleService {

    @Resource
    private IUserParticleDao userParticleDao;
    @Override
    public UserParticle queryObjectById(String id) {
        return null;
    }

    @Override
    public UserParticle queryObjectById(int id) {
        return null;
    }

    @Override
    public List<UserParticle> queryList() {
        return null;
    }

    @Override
    public int save(UserParticle obj) {
        if(StringUtils.isBlank(obj.getUid())){
            obj.setCreateTime(new Date());
            obj.setUid(UuidUtils.getUpperUuid());
        }
        return userParticleDao.save(obj);
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
    public int update(UserParticle userParticle) {
        return 0;
    }

    @Override
    public int getTotalCount(UserParticle userParticle) {
        return 0;
    }

    @Override
    public List<UserParticle> queryListPO(int pageIndex, int pageSize, UserParticle userParticle) {
        return null;
    }
}
