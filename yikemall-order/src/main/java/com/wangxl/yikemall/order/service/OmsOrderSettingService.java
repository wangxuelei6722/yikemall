package com.wangxl.yikemall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangxl.common.utils.PageUtils;
import com.wangxl.yikemall.order.entity.OmsOrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author wangxl
 * @email 475524154@qq.com
 * @date 2020-12-31 11:30:49
 */
public interface OmsOrderSettingService extends IService<OmsOrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

