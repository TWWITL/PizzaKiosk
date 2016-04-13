package com.tw.pizzakiosk;

import com.tw.pizzakiosk.crusts.Crust;
import com.tw.pizzakiosk.sizes.Size;
import com.tw.pizzakiosk.toppings.Topping;

import java.util.List;

class Pizza {
    private Size size;
    private Crust crust;
    private List<Topping> toppings;

    Pizza() {
        this.size = null;
        this.crust = null;
        this.toppings = null;
    }

    Size getSize() {
        return size;
    }

    void setSize(Size size) {
        this.size = size;
    }

    Crust getCrust() {
        return crust;
    }

    void setCrust(Crust crust) {
        this.crust = crust;
    }

    List<Topping> getToppings() {
        return toppings;
    }

    void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
