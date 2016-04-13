package com.tw.pizzakiosk.sizes;

public class Size {
    protected int slices;
    protected String desc;
    protected String descURL;
    protected double cost;

    public Size() {

    }

    public Size(int slices, String desc, String descURL, double cost) {
        this.slices = slices;
        this.desc = desc;
        this.descURL = descURL;
        this.cost = cost;
    }

    public int getSlices() {
        return slices;
    }

    public void setSlices(int slices) {
        this.slices = slices;
    }

    public String getDescURL() {
        return descURL;
    }

    public void setDescURL(String descURL) {
        this.descURL = descURL;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
