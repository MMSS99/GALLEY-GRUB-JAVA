package edu.estatuas.galleygrub.receipt;

import edu.estatuas.galleygrub.order.Comanda;
import edu.estatuas.galleygrub.order.Order;

public class Receipt implements Ticket {
    private double total;
    private final Comanda order;

    public Receipt(Comanda order){
        this.order = order;
        order.itemList().forEach(item -> {total += item.price();});
    }

    @Override
    public double total(){
        return total;
    }

    @Override
    public void print(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return "- - - PRINTING RECEIPT - - - \n" + order.toString();
    }
}
