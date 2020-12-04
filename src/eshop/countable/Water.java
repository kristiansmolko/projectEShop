package eshop.countable;

import eshop.Item;
import eshop.util.Util;

public class Water extends Item implements CountITem {
    private int count;

    public Water(String name, double price, int count){
        super(name, price);
        this.count = count;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public double getItemPrice() {
        return count*getPrice();
    }

    @Override
    public String toString() {
        return "Water: " + getName() + ", Price per kg: " + getPrice() +
                ", Count: " + count + ", Price: " + Util.formatPrice(getItemPrice());
    }
}
