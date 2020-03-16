package com.zhaoyumeng.gmall.manage.mapper;

import  com.zhaoyumeng.gmall.bean.PmsProductSaleAttr;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author zhaoyumeng
 * @create 2020-02-27 13:13
 * @Program name
 */
public interface PmsProductSaleAttrMapper extends Mapper<PmsProductSaleAttr> {
    List<PmsProductSaleAttr> selectSpuSaleAttrListCheckBySku(@Param("productId")String productId, @Param("skuId")String skuId);
}
