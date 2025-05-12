package edu.estatuas.galleygrub.order;

import edu.estatuas.galleygrub.items.Item;

import java.util.ArrayList;

public interface Comanda {
    void addItem(String item, double price, String extra);
    void addItem(String item, double price);
    void display();
    ArrayList<Item> itemList();
}
