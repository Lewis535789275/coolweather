package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/9/16 0016.
 * 存放省级数据信息
 */

public class Province extends DataSupport {

    private int id; //每个实体类都应该有的字段，和项目无关，一定要有
    private String provinceName; //省名
    private int provinceCode; //省代码

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProvinceName() {
        return provinceName;
    }
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

