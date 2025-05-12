package edu.estatuas.galleygrub.items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RetailPrice {
    static Map<String, Double> prices =  new HashMap<String, Double>();

    public static void init_prices(){
        prices.put("Cheese", 0.25d);
        prices.put("Sauce", 0.50d);
        prices.put("Medium", 0.25d);
        prices.put("Large", 0.50d);
    }

    public static void display(){
        StringBuilder display = new StringBuilder();
        prices.forEach((k,v)->{
            display.append(k + "...." + v + "\n");
        });
        System.out.println(display.toString());
    }
}
