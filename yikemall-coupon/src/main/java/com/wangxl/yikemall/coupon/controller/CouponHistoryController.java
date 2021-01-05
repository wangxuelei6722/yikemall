package com.wangxl.yikemall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangxl.yikemall.coupon.entity.CouponHistoryEntity;
import com.wangxl.yikemall.coupon.service.CouponHistoryService;
import com.wangxl.common.utils.PageUtils;
import com.wangxl.common.utils.R;



/**
 * 优惠券领取历史记录
 *
 * @author wangxl
 * @email 475524154@qq.com
 * @date 2020-12-30 18:53:56
 */
@RestController
@RequestMapping("coupon/smscouponhistory")
public class CouponHistoryController {
    @Autowired
    private CouponHistoryService couponHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:smscouponhistory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:smscouponhistory:info")
    public R info(@PathVariable("id") Long id){
		CouponHistoryEntity smsCouponHistory = couponHistoryService.getById(id);

        return R.ok().put("smsCouponHistory", smsCouponHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:smscouponhistory:save")
    public R save(@RequestBody CouponHistoryEntity smsCouponHistory){
		couponHistoryService.save(smsCouponHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:smscouponhistory:update")
    public R update(@RequestBody CouponHistoryEntity smsCouponHistory){
		couponHistoryService.updateById(smsCouponHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:smscouponhistory:delete")
    public R delete(@RequestBody Long[] ids){
		couponHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
