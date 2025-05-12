package edu.estatuas.galleygrub.order;

import edu.estatuas.galleygrub.items.Item;
import edu.estatuas.galleygrub.items.ItemFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda{
    private ArrayList<Item> items = new ArrayList<>();
    private Double total = 0d;

    public ArrayList<Item> itemList(){
        return items;
    }

    @Override
    public void addItem(String item, double price) {
        total += price;
        items.add(ItemFactory.getInstance().getItem(item, price));
    }

    @Override
    public void addItem(String item, double price, String extra){
        total += price;
        items.add(ItemFactory.getInstance().getItem(item, price, extra));
    }

    @Override
    public void display() {
        StringBuilder display = new StringBuilder();
        items.forEach(item -> display.append(item.toString()).append("\n"));
        System.out.println(display.toString());
    }
}
