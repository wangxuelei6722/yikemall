package com.wangxl.yikemall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangxl.common.utils.PageUtils;
import com.wangxl.yikemall.coupon.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author wangxl
 * @email 475524154@qq.com
 * @date 2020-12-30 18:53:56
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

