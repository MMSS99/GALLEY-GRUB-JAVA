package edu.estatuas.galleygrub.order;

public interface Comanda {
    void addItem(String item, double price, String extra);
    void addItem(String item, double price);
}
