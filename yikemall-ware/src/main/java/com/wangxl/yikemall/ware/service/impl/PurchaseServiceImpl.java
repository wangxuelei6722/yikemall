package com.wangxl.yikemall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wangxl.common.utils.PageUtils;
import com.wangxl.common.utils.Query;

import com.wangxl.yikemall.ware.dao.PurchaseDao;
import com.wangxl.yikemall.ware.entity.PurchaseEntity;
import com.wangxl.yikemall.ware.service.PurchaseService;


@Service("wmsPurchaseService")
public class PurchaseServiceImpl extends ServiceImpl<PurchaseDao, PurchaseEntity> implements PurchaseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PurchaseEntity> page = this.page(
                new Query<PurchaseEntity>().getPage(params),
                new QueryWrapper<PurchaseEntity>()
        );

        return new PageUtils(page);
    }

}