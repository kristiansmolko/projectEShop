package eshop;

import eshop.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> list;

    public Cart(){
        list = new ArrayList<>();
    }

    public void addItem(Item newItem){
        list.add(newItem);
    }

    public int getCountOfItems(){
        return list.size();
    }

    public double getTotalPrice(){
        double total = 0;
        for (Item temp : list){
            total -= -(temp.getItemPrice());
        }
        return Util.formatPrice(total);
    }

    public void printCart(){
        System.out.println("List of items in your cart:");
        for (Item temp : list){
            System.out.println(" - " + temp.toString());
        }
    }

    public void printAll(){
        printCart();
        System.out.println("----------------------------------------------------------");
        System.out.println("Total price: " + getTotalPrice());
    }
}
