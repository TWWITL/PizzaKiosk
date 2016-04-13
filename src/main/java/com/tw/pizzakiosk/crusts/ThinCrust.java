package com.tw.pizzakiosk.crusts;

public class ThinCrust extends Crust {
    public ThinCrust() {
        this.stuffed = false;
        this.desc = "THIN CRUST";
        this.cost = 150.0;
    }

    @Override
    public boolean isStuffed() {
        return false;
    }

    @Override
    public void addStuffing() {
    }

    @Override
    public void removeStuffing() {
    }
}
