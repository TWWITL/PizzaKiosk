package com.tw.pizzakiosk;

import com.tw.pizzakiosk.crusts.Crust;
import com.tw.pizzakiosk.sizes.Size;
import com.tw.pizzakiosk.toppings.Topping;
import com.tw.pizzakiosk.utils.DataSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class PizzaKiosk {
    private Pizza pizza;
    private Map<String, Size> sizeMap;
    private Map<String, Topping> toppingMap;
    private static PizzaKiosk kiosk = new PizzaKiosk();

    private PizzaKiosk() {
        DataSource dataSource = new DataSource();

        this.sizeMap = dataSource.getSizeMap();
        this.toppingMap = dataSource.getToppingMap();
    }

    public static PizzaKiosk getInstance(){
        return kiosk;
    }


    double makePizzaWith(Crust crust, String size, List<String> toppingList) {
        pizza = new Pizza();

        pizza.setCrust(crust);
        pizza.setSize(sizeMap.get(size));
        List<Topping> toppings = new ArrayList<>();

        for (String topping : toppingList) {
            toppings.add(toppingMap.get(topping));
        }

        pizza.setToppings(toppings);

        return estimateCost(pizza);
    }

    private double estimateCost(Pizza pizza) {
        double cost = pizza.getCrust().getCost() + sizeMap.get(pizza.getSize().getDesc()).getCost();

        for (Topping topping : pizza.getToppings()) {
            cost += toppingMap.get(topping.getDesc()).getCost();
        }

        return cost;
    }
}
