package com.zhaoyumeng.gmall.bean;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author zhaoyumeng
 * @create 2020-02-24 13:00
 * @Program name
 */
public class PmsBaseCatalog3 implements Serializable {
    @Id
    String id;
    String name;
    String catalog2Id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(String catalog2Id) {
        this.catalog2Id = catalog2Id;
    }
}
