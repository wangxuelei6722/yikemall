package com.wangxl.yikemall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wangxl.common.utils.PageUtils;
import com.wangxl.common.utils.Query;

import com.wangxl.yikemall.member.dao.UmsMemberLoginLogDao;
import com.wangxl.yikemall.member.entity.UmsMemberLoginLogEntity;
import com.wangxl.yikemall.member.service.UmsMemberLoginLogService;


@Service("umsMemberLoginLogService")
public class UmsMemberLoginLogServiceImpl extends ServiceImpl<UmsMemberLoginLogDao, UmsMemberLoginLogEntity> implements UmsMemberLoginLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberLoginLogEntity> page = this.page(
                new Query<UmsMemberLoginLogEntity>().getPage(params),
                new QueryWrapper<UmsMemberLoginLogEntity>()
        );

        return new PageUtils(page);
    }

}