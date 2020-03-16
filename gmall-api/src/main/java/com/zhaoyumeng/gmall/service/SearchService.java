package com.zhaoyumeng.gmall.service;

import com.zhaoyumeng.gmall.bean.PmsSearchParam;
import com.zhaoyumeng.gmall.bean.PmsSearchSkuInfo;

import java.util.List;

/**
 * @author zhaoyumeng
 * @create 2020-03-14 21:39
 * @Program name
 */
public interface SearchService {
    List<PmsSearchSkuInfo> list(PmsSearchParam pmsSearchParam);
}
