package eshop;

import eshop.countable.CountITem;
import eshop.service.Service;
import eshop.uncountable.WeightItem;
import eshop.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> list;

    public Cart(){
        list = new ArrayList<>();
    }

    public void addItem(Item newItem){
        if (newItem.getPrice() >= 0){
            if (newItem instanceof WeightItem && ((WeightItem) newItem).getWeight() > 0) {
                boolean isAlreadyIn = false;
                for (Item temp : list){
                    if (temp.getName().equalsIgnoreCase(newItem.getName()) && temp.getPrice() == newItem.getPrice()){
                        ((WeightItem) temp).setWeight(((WeightItem) temp).getWeight() + ((WeightItem) newItem).getWeight());
                        isAlreadyIn = true;
                        break;
                    }
                }
                if (!isAlreadyIn)
                    list.add(newItem);
            }
            if (newItem instanceof CountITem && ((CountITem) newItem).getCount() > 0) {
                boolean isAlreadyIn = false;
                for (Item temp : list){
                    if (temp.getName().equalsIgnoreCase(newItem.getName()) && temp.getPrice() == newItem.getPrice()){
                        ((CountITem) temp).setCount(((CountITem) temp).getCount() + ((CountITem) newItem).getCount());
                        isAlreadyIn = true;
                        break;
                    }
                }
                if (!isAlreadyIn)
                    list.add(newItem);
            }
            if (newItem instanceof Service)
                list.add(newItem);
        }
    }

    public int getCountOfItems(){
        return list.size();
    }

    public double getTotalPrice(){
        double total = 0;
        for (Item temp : list){
            total -= -(Util.formatPrice(temp.getItemPrice()));
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
