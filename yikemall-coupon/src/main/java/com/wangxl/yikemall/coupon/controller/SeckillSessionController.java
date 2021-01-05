package com.wangxl.yikemall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangxl.yikemall.coupon.entity.SeckillSessionEntity;
import com.wangxl.yikemall.coupon.service.SeckillSessionService;
import com.wangxl.common.utils.PageUtils;
import com.wangxl.common.utils.R;



/**
 * 秒杀活动场次
 *
 * @author wangxl
 * @email 475524154@qq.com
 * @date 2020-12-30 18:53:56
 */
@RestController
@RequestMapping("coupon/smsseckillsession")
public class SeckillSessionController {
    @Autowired
    private SeckillSessionService seckillSessionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:smsseckillsession:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = seckillSessionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:smsseckillsession:info")
    public R info(@PathVariable("id") Long id){
		SeckillSessionEntity smsSeckillSession = seckillSessionService.getById(id);

        return R.ok().put("smsSeckillSession", smsSeckillSession);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:smsseckillsession:save")
    public R save(@RequestBody SeckillSessionEntity smsSeckillSession){
		seckillSessionService.save(smsSeckillSession);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:smsseckillsession:update")
    public R update(@RequestBody SeckillSessionEntity smsSeckillSession){
		seckillSessionService.updateById(smsSeckillSession);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:smsseckillsession:delete")
    public R delete(@RequestBody Long[] ids){
		seckillSessionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
