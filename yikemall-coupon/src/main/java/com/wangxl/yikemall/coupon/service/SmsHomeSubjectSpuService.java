package com.wangxl.yikemall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangxl.common.utils.PageUtils;
import com.wangxl.yikemall.coupon.entity.SmsHomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author wangxl
 * @email 475524154@qq.com
 * @date 2020-12-30 18:53:56
 */
public interface SmsHomeSubjectSpuService extends IService<SmsHomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

