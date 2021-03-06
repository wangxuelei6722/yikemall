package com.wangxl.yikemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangxl.common.utils.PageUtils;
import com.wangxl.yikemall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author wangxl
 * @email 475524154@qq.com
 * @date 2020-12-29 18:19:57
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

