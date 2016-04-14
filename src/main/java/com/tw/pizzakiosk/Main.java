package com.tw.pizzakiosk;

import com.tw.pizzakiosk.crusts.Crust;
import com.tw.pizzakiosk.crusts.ThickCrust;
import com.tw.pizzakiosk.crusts.ThinCrust;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        Crust crust = null;
        String size = null;

        System.out.println("Pizza Crusts: ");
        System.out.println("1: THIN");
        System.out.println("2: THICK");
        System.out.println("Enter choice: ");
        choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1:
                crust = new ThinCrust();
                break;
            case 2:
                crust = new ThickCrust();
                break;
            default:
                System.err.println("Invalid Crust choice");
                System.exit(-1);
        }

        System.out.println("Pizza Size: ");
        System.out.println("1: LARGE");
        System.out.println("2: MEDIUM");
        System.out.println("3: SMALL");
        System.out.println("Enter choice: ");
        choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1:
                size = "LARGE";
                break;
            case 2:
                size = "MEDIUM";
                break;
            case 3:
                size = "SMALL";
                break;
            default:
                System.err.println("Invalid Size choice");
                System.exit(-1);
        }

        System.out.println("Toppings: ");
        System.out.println("1: PEPPERONI");
        System.out.println("2: PANEER");
        System.out.println("3: MIXED VEG");
        System.out.println("4: EXTRA CHEESE");
        System.out.println("Enter choices: ");

        String toppingChoices = br.readLine();
        List<String> toppings = new ArrayList<>();

        for (String toppingChoice : toppingChoices.split(" ")) {
            switch (Integer.parseInt(toppingChoice)) {
                case 1:
                    toppings.add("PEPPERONI");
                    break;
                case 2:
                    toppings.add("PANEER");
                    break;
                case 3:
                    toppings.add("MIXED VEG");
                    break;
                case 4:
                    toppings.add("EXTRA CHEESE");
                    break;
                default:
                    System.err.println("Invalid Topping: " + toppingChoice);
            }
        }

        double cost = PizzaKiosk.getInstance().makePizzaWith(crust, size, toppings);
        System.out.println("Your Pizza costs: " + cost);
    }
}
