package club.lovety.portal.serivce.impl;


import club.lovety.cache.service.BaseCacheService;
import club.lovety.portal.dao.IIndexDao;
import club.lovety.portal.entity.IndexPageInfo;
import club.lovety.portal.serivce.IIndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 念梓  on 2016/8/17.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@Service
public class IndexServiceImpl implements IIndexService {

    @Resource
    private IIndexDao indexDao;

    @Resource
    private BaseCacheService cacheService;


    @Override
    public IndexPageInfo queryObjectById(String id) {
        return null;
    }

    @Override
    public IndexPageInfo queryObjectById(int id) {
        return null;
    }

    @Override
    public List<IndexPageInfo> queryList() {
        return null;
    }

    @Override
    public int save(IndexPageInfo obj) {
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
    public int update(IndexPageInfo indexPageInfo) {
        return 0;
    }

    @Override
    public int getTotalCount(IndexPageInfo indexPageInfo) {
        return 0;
    }

    @Override
    public List<IndexPageInfo> queryListPO(int pageIndex, int pageSize, IndexPageInfo indexPageInfo) {
        return null;
    }


    @Override
    public List<IndexPageInfo> queryList(IndexPageInfo indexPageInfo) {
        return indexDao.queryList(indexPageInfo);
    }



}
