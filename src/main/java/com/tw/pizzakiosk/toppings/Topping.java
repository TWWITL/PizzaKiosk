package com.tw.pizzakiosk.toppings;

public class Topping {
    protected boolean veg, spicy;
    protected String desc;
    protected double cost;

    public Topping() {

    }

    public Topping(boolean veg, boolean spicy, String desc, double cost) {
        this.veg = veg;
        this.spicy = spicy;
        this.desc = desc;
        this.cost = cost;
    }

    boolean isVegetarian() {
        return this.veg;
    }

    boolean isSpicy() {
        return this.spicy;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    public boolean getVeg() {
        return this.veg;
    }

    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }

    public boolean getSpicy() {
        return this.spicy;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
