package com.zhaoyumeng.gmall.item.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.zhaoyumeng.gmall.bean.PmsProductSaleAttr;
import com.zhaoyumeng.gmall.bean.PmsSkuInfo;
import com.zhaoyumeng.gmall.bean.PmsSkuSaleAttrValue;
import com.zhaoyumeng.gmall.service.SkuService;
import com.zhaoyumeng.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhaoyumeng
 * @create 2020-03-02 10:42
 * @Program name
 */
@Controller
public class ItemController {
    @Reference
    SkuService skuService;

    @Reference
    SpuService spuService;

    /**
     * ModelMap对象主要用于传递控制方法处理数据到结果页面
     * modelmap本身不能设置页面跳转的url地址别名或者物理跳转地址，
     * 可以通过控制器方法的字符串返回值来设置跳转url地址别名或者物理跳转地址。
     * ModelMap的实例是spirng mvc框架自动创建并作为控制器方法参数传入，用户无需自己创建。
     */

    //如何根据销售属性切换到当前商品sku
    @RequestMapping("/{skuId}.html")
    public String getSkuById(@PathVariable String skuId, ModelMap map, HttpServletRequest request) {
        //重点看一下下面两条语句
        String remoteAddr = request.getRemoteAddr();
        PmsSkuInfo pmsSkuInfo = skuService.getSkuById(skuId,remoteAddr);
        //sku对象
        map.put("skuInfo", pmsSkuInfo);

       //销售属性列表并选中销售属性值
        List<PmsProductSaleAttr> pmsProductSaleAttrs = spuService.spuSaleAttrListCheckBySku(pmsSkuInfo.getProductId(), pmsSkuInfo.getId());
        map.put("spuSaleAttrListCheckBySku", pmsProductSaleAttrs);

        //查询当前sku的spu的其他sku的集合的hash表
        //////根据sku对应的spuId查询出来相对应的所有的PmsSkuInfo信息
        Map<String, String> skuSaleAttrHash = new HashMap<>();
        List<PmsSkuInfo> pmsSkuInfos = skuService.getSkuSaleAttrValueListBySpu(pmsSkuInfo.getProductId());

        for (PmsSkuInfo skuInfo : pmsSkuInfos) {
            String k = "";
            String v = skuInfo.getId();
            List<PmsSkuSaleAttrValue> skuSaleAttrValueList = skuInfo.getSkuSaleAttrValueList();
            for (PmsSkuSaleAttrValue pmsSkuSaleAttrValue : skuSaleAttrValueList) {
                k += pmsSkuSaleAttrValue.getSaleAttrValueId() + "|";// "239|245"
            }
            skuSaleAttrHash.put(k, v);
        }

        // 将sku的销售属性hash表放到页面
        String skuSaleAttrHashJsonStr = JSON.toJSONString(skuSaleAttrHash);
        map.put("skuSaleAttrHashJsonStr", skuSaleAttrHashJsonStr);

        return "item";
    }

    //thymeleaf简单使用
    @RequestMapping("index")
    public String index(ModelMap modelMap) {

        modelMap.put("hello", "hello thymeleaf !!");

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("循环数据" + i);
        }
        modelMap.put("list", list);

        modelMap.put("check", "0");

        return "index";
    }


}
