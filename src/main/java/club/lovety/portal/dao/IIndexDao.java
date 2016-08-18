package club.lovety.portal.dao;


import club.lovety.base.dao.IDao;
import club.lovety.portal.entity.IndexPageInfo;

import java.util.List;

/**
 * Created by 念梓  on 2016/8/17.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public interface IIndexDao extends IDao<IndexPageInfo> {

    public List<IndexPageInfo> queryList(IndexPageInfo indexPageInfo);
}
