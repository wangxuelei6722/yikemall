package com.wangxl.yikemall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangxl.common.utils.PageUtils;
import com.wangxl.yikemall.ware.entity.WmsWareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author wangxl
 * @email 475524154@qq.com
 * @date 2020-12-31 11:35:14
 */
public interface WmsWareSkuService extends IService<WmsWareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

