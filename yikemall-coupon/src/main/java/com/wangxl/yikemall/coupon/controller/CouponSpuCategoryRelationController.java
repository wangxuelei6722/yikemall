package com.wangxl.yikemall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangxl.yikemall.coupon.entity.CouponSpuCategoryRelationEntity;
import com.wangxl.yikemall.coupon.service.CouponSpuCategoryRelationService;
import com.wangxl.common.utils.PageUtils;
import com.wangxl.common.utils.R;



/**
 * 优惠券分类关联
 *
 * @author wangxl
 * @email 475524154@qq.com
 * @date 2020-12-30 18:53:56
 */
@RestController
@RequestMapping("coupon/smscouponspucategoryrelation")
public class CouponSpuCategoryRelationController {
    @Autowired
    private CouponSpuCategoryRelationService couponSpuCategoryRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:smscouponspucategoryrelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponSpuCategoryRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:smscouponspucategoryrelation:info")
    public R info(@PathVariable("id") Long id){
		CouponSpuCategoryRelationEntity smsCouponSpuCategoryRelation = couponSpuCategoryRelationService.getById(id);

        return R.ok().put("smsCouponSpuCategoryRelation", smsCouponSpuCategoryRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:smscouponspucategoryrelation:save")
    public R save(@RequestBody CouponSpuCategoryRelationEntity smsCouponSpuCategoryRelation){
		couponSpuCategoryRelationService.save(smsCouponSpuCategoryRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:smscouponspucategoryrelation:update")
    public R update(@RequestBody CouponSpuCategoryRelationEntity smsCouponSpuCategoryRelation){
		couponSpuCategoryRelationService.updateById(smsCouponSpuCategoryRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:smscouponspucategoryrelation:delete")
    public R delete(@RequestBody Long[] ids){
		couponSpuCategoryRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
