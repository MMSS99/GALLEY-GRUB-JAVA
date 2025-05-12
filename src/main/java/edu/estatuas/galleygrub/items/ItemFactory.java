package edu.estatuas.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
    public Map<String, Item> items = new HashMap<String, Item>();
    private static ItemFactory instance = new ItemFactory();

    public static ItemFactory getInstance() {
        return instance;
    }

    public static Item getItem(String item, double price) {
        instance.items.putIfAbsent(item, new Item(item, price));
        return instance.items.get(item);
    }

    public static Item getItem(String item, double price, String extra) {
        String itemExtra = item + " w/ " + extra;
        instance.items.putIfAbsent(item, new Item(itemExtra, price));
        return instance.items.get(itemExtra);
    }

}
