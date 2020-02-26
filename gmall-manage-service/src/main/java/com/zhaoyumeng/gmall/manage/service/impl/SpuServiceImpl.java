package com.zhaoyumeng.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhaoyumeng.gmall.bean.PmsProductInfo;
import com.zhaoyumeng.gmall.manage.mapper.PmsProductInfoMapper;
import com.zhaoyumeng.gmall.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zhaoyumeng
 * @create 2020-02-26 14:17
 * @Program name
 */
@Service
public class SpuServiceImpl implements SpuService {
    @Autowired
    PmsProductInfoMapper pmsProductInfoMapper;

    @Override
    public List<PmsProductInfo> spuList(String catalog3Id) {
        return pmsProductInfoMapper.selectAll();
    }
}
