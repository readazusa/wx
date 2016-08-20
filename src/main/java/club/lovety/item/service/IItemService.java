package club.lovety.item.service;

import club.lovety.base.entity.BasePagePO;
import club.lovety.base.service.IService;
import club.lovety.item.entity.ItemInfo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 念梓  on 2016/8/18.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
public interface IItemService extends IService<ItemInfo>{

    public BasePagePO<ItemInfo> queryList(HttpServletRequest request);

}
