package com.wangxl.yikemall.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangxl.yikemall.member.entity.MemberStatisticsInfoEntity;
import com.wangxl.yikemall.member.service.MemberStatisticsInfoService;
import com.wangxl.common.utils.PageUtils;
import com.wangxl.common.utils.R;



/**
 * 会员统计信息
 *
 * @author wangxl
 * @email 475524154@qq.com
 * @date 2020-12-31 11:19:40
 */
@RestController
@RequestMapping("member/umsmemberstatisticsinfo")
public class MemberStatisticsInfoController {
    @Autowired
    private MemberStatisticsInfoService memberStatisticsInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:umsmemberstatisticsinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberStatisticsInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:umsmemberstatisticsinfo:info")
    public R info(@PathVariable("id") Long id){
		MemberStatisticsInfoEntity umsMemberStatisticsInfo = memberStatisticsInfoService.getById(id);

        return R.ok().put("umsMemberStatisticsInfo", umsMemberStatisticsInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:umsmemberstatisticsinfo:save")
    public R save(@RequestBody MemberStatisticsInfoEntity umsMemberStatisticsInfo){
		memberStatisticsInfoService.save(umsMemberStatisticsInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:umsmemberstatisticsinfo:update")
    public R update(@RequestBody MemberStatisticsInfoEntity umsMemberStatisticsInfo){
		memberStatisticsInfoService.updateById(umsMemberStatisticsInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:umsmemberstatisticsinfo:delete")
    public R delete(@RequestBody Long[] ids){
		memberStatisticsInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
