package com.zhaoyumeng.gmall.service;

import com.zhaoyumeng.gmall.bean.PmsProductImage;
import com.zhaoyumeng.gmall.bean.PmsProductInfo;
import com.zhaoyumeng.gmall.bean.PmsProductSaleAttr;

import java.util.List;

/**
 * @author zhaoyumeng
 * @create 2020-02-26 14:16
 * @Program name
 */
public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);

    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    List<PmsProductSaleAttr> spuSaleAttrList(String spuId);

    List<PmsProductImage> spuImageList(String spuId);

    List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(String productId, String skuId);
}
