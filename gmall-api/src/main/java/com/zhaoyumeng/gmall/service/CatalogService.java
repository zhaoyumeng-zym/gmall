package com.zhaoyumeng.gmall.service;

import com.zhaoyumeng.gmall.bean.PmsBaseCatalog1;
import com.zhaoyumeng.gmall.bean.PmsBaseCatalog2;
import com.zhaoyumeng.gmall.bean.PmsBaseCatalog3;

import java.util.List;

/**
 * @author zhaoyumeng
 * @create 2020-02-24 14:05
 * @Program name
 */
public interface CatalogService {
    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
