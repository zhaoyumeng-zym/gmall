package com.zhaoyumeng.gmall.service;

import com.zhaoyumeng.gmall.bean.PmsBaseAttrInfo;
import com.zhaoyumeng.gmall.bean.PmsBaseAttrValue;
import com.zhaoyumeng.gmall.bean.PmsBaseSaleAttr;

import java.util.List;
import java.util.Set;

/**
 * @author zhaoyumeng
 * @create 2020-02-24 16:05
 * @Program name
 */
public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();

    List<PmsBaseAttrInfo> getAttrValueListByValueId(Set<String> valueIdSet);
}
