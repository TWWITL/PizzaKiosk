package com.tw.pizzakiosk;

import com.tw.pizzakiosk.crusts.ThickCrust;
import com.tw.pizzakiosk.crusts.ThinCrust;
import com.tw.pizzakiosk.sizes.Size;
import com.tw.pizzakiosk.toppings.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PizzaTest {
    private Pizza pizza;

    @Before
    public void setUp() throws Exception {
        pizza = new Pizza();
    }

    @Test
    public void shouldGetSize() throws Exception {
        pizza.setSize(new Size(10, "LARGE", "", 200));
        assertEquals(pizza.getSize().getDesc(), "LARGE");
    }

    @Test
    public void shouldSetSize() throws Exception {
        pizza.setSize(new Size(6, "MEDIUM", "", 150));
        assertEquals(pizza.getSize().getDesc(), "MEDIUM");
    }

    @Test
    public void shouldGetCrust() throws Exception {
        pizza.setCrust(new ThickCrust());
        assertEquals(pizza.getCrust().getDesc(), "THICK CRUST");
    }

    @Test
    public void shouldSetCrust() throws Exception {
        pizza.setCrust(new ThinCrust());
        assertEquals(pizza.getCrust().getDesc(), "THIN CRUST");
    }

    @Test
    public void shouldGetToppings() throws Exception {
        List<Topping> toppings = new ArrayList<>();

        Topping panner = new Topping(true, false, "PANEER", 50.0);
        Topping pepperoni = new Topping(false, true, "PEPPERONI", 75.0);

        toppings.add(pepperoni);
        toppings.add(panner);

        Topping[] expectedArray = {
                pepperoni,
                panner
        };

        pizza.setToppings(toppings);

        assertArrayEquals(pizza.getToppings().toArray(), expectedArray);
    }

    @Test
    public void shouldSetToppings() throws Exception {
        List<Topping> toppings = new ArrayList<>();

        Topping extraCheese = new Topping(true, false, "EXTRA CHEESE", 30.0);
        Topping mixedVeg = new Topping(true, true, "MIXED VEG", 60.0);

        toppings.add(extraCheese);
        toppings.add(mixedVeg);

        Topping[] expectedArray = {
                extraCheese,
                mixedVeg
        };

        pizza.setToppings(toppings);

        assertArrayEquals(pizza.getToppings().toArray(), expectedArray);
    }
}
