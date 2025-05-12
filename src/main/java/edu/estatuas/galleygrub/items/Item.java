package edu.estatuas.galleygrub.items;

public class Item implements Product{
    String name;
    Double price;
    String extra;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    @Override
    public String toString(){
        return extra == null ? (name + "...." + price) : (name + " w/ " + extra + "...." + price);
    }
}
