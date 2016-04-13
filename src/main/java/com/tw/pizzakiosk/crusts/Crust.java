package com.tw.pizzakiosk.crusts;

public abstract class Crust {
    protected boolean stuffed;
    protected String desc;
    protected double cost;

    public boolean isStuffed() {
        return stuffed;
    }

    public void addStuffing() {
        this.stuffed = true;
    }

    public void removeStuffing() {
        this.stuffed = false;
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
