package com.wangxl.yikemall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wangxl.common.utils.PageUtils;
import com.wangxl.common.utils.Query;

import com.wangxl.yikemall.order.dao.OrderReturnReasonDao;
import com.wangxl.yikemall.order.entity.OrderReturnReasonEntity;
import com.wangxl.yikemall.order.service.OrderReturnReasonService;


@Service("omsOrderReturnReasonService")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonDao, OrderReturnReasonEntity> implements OrderReturnReasonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnReasonEntity> page = this.page(
                new Query<OrderReturnReasonEntity>().getPage(params),
                new QueryWrapper<OrderReturnReasonEntity>()
        );

        return new PageUtils(page);
    }

}