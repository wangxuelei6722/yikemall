package com.wangxl.yikemall.product.dao;

import com.wangxl.yikemall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangxl
 * @email 475524154@qq.com
 * @date 2020-12-29 18:19:57
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
