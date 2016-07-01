package club.lovety.user.service.impl;

import club.lovety.user.dao.IAddressInfoDao;
import club.lovety.user.entity.AddressInfo;
import club.lovety.user.entity.UserInfo;
import club.lovety.user.service.IAddressInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * club.lovety.user.service.impl
 * Created by smc
 * date on 2016/4/19.
 * Email:sunmch@163.com
 */
@Service
public class AddressInfoServiceImpl implements IAddressInfoService {

    @Resource
    private IAddressInfoDao addressInfoDao;

    @Override
    public AddressInfo queryObjectById(String id) {
        return null;
    }

    @Override
    public AddressInfo queryObjectById(int id) {
        return null;
    }

    @Override
    public List<AddressInfo> queryList() {
        return null;
    }

    @Override
    public int save(AddressInfo obj) {
        return 0;
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
    public int update(AddressInfo addressInfo) {
        return 0;
    }

    @Override
    public int getTotalCount(AddressInfo addressInfo) {
        return 0;
    }

    @Override
    public List<AddressInfo> queryListPO(int pageIndex, int pageSize, AddressInfo addressInfo) {
        return null;
    }
}
