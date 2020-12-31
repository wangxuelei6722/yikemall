package com.wangxl.yikemall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangxl.common.utils.PageUtils;
import com.wangxl.yikemall.coupon.entity.SmsCouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author wangxl
 * @email 475524154@qq.com
 * @date 2020-12-30 18:53:56
 */
public interface SmsCouponService extends IService<SmsCouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

