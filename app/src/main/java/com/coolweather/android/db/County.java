package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/9/16 0016.
 * 区县数据信息
 */

public class County extends DataSupport{

    private int id;
    private String countyName;
    private String weatherID; //天气ID
    private int cityID; //当前从属的市

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCountyName() {
        return countyName;
    }
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
    public String getWeatherID() {
        return weatherID;
    }
    public void setWeatherID(String weatherID) {
        this.weatherID = weatherID;
    }
    public int getCityID() {
        return cityID;
    }
    public void setCityID(int cityID) {
        this.cityID = cityID;
    }
}
