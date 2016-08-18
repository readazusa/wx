package club.lovety.portal.serivce;


import club.lovety.base.service.IService;
import club.lovety.portal.entity.IndexPageInfo;

import java.util.List;

/**
 * Created by 念梓  on 2016/8/17.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public interface  IIndexService  extends IService<IndexPageInfo> {

    public List<IndexPageInfo> queryList(IndexPageInfo indexPageInfo);



}
