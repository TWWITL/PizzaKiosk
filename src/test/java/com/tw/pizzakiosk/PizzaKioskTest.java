package com.tw.pizzakiosk;

import com.tw.pizzakiosk.crusts.ThickCrust;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class PizzaKioskTest {
    private PizzaKiosk kiosk;

    @Before
    public void setUp() throws Exception {
        kiosk = new PizzaKiosk();
    }

    @Test
    public void shouldCalculateCostForPizza() {
        List<String> toppings = new ArrayList<>();

        toppings.add("PEPPERONI");
        toppings.add("PANEER");

        assertEquals(kiosk.makePizzaWith(new ThickCrust(), "LARGE", toppings), 425.0, 0);
    }
}
