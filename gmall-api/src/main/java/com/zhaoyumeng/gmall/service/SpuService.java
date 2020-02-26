package com.zhaoyumeng.gmall.service;

import com.zhaoyumeng.gmall.bean.PmsProductInfo;

import java.util.List;

/**
 * @author zhaoyumeng
 * @create 2020-02-26 14:16
 * @Program name
 */
public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);

}
