package com.wangxl.yikemall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangxl.yikemall.order.entity.OmsOrderReturnApplyEntity;
import com.wangxl.yikemall.order.service.OmsOrderReturnApplyService;
import com.wangxl.common.utils.PageUtils;
import com.wangxl.common.utils.R;



/**
 * 订单退货申请
 *
 * @author wangxl
 * @email 475524154@qq.com
 * @date 2020-12-31 11:30:49
 */
@RestController
@RequestMapping("order/omsorderreturnapply")
public class OmsOrderReturnApplyController {
    @Autowired
    private OmsOrderReturnApplyService omsOrderReturnApplyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("order:omsorderreturnapply:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = omsOrderReturnApplyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("order:omsorderreturnapply:info")
    public R info(@PathVariable("id") Long id){
		OmsOrderReturnApplyEntity omsOrderReturnApply = omsOrderReturnApplyService.getById(id);

        return R.ok().put("omsOrderReturnApply", omsOrderReturnApply);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("order:omsorderreturnapply:save")
    public R save(@RequestBody OmsOrderReturnApplyEntity omsOrderReturnApply){
		omsOrderReturnApplyService.save(omsOrderReturnApply);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("order:omsorderreturnapply:update")
    public R update(@RequestBody OmsOrderReturnApplyEntity omsOrderReturnApply){
		omsOrderReturnApplyService.updateById(omsOrderReturnApply);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("order:omsorderreturnapply:delete")
    public R delete(@RequestBody Long[] ids){
		omsOrderReturnApplyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
