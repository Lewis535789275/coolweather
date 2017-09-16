package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/9/16 0016.
 * 存放市级数据信息
 */

public class City extends DataSupport{

    private int id; //每个实体类都应该有的字段，和项目无关，一定要有
    private String cityName; //市名
    private int cityCode; //市代码
    private int provinceID; //从属省份的ID/Code

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public int getCityCode() {
        return cityCode;
    }
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceID() {
        return provinceID;
    }
    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }
}
