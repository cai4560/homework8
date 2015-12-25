package com.thoughtworks.myapplication.domain;

import com.google.gson.annotations.SerializedName;

public class PM25 {
    @SerializedName("position_name")
    private String positionName;

    @SerializedName("quality")
    private String quality;

    @SerializedName("aqi")
    private String aqi;

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getQuality() {
        return quality;
    }

    public String getAqi() {
        return aqi ;
    }


    public void setQuality(String quality) {
        this.quality = quality;
    }
    public void setAqi(String aqi) {

        this.aqi = aqi;
    }
}

