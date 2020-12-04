package eshop.uncountable;


import eshop.Item;
import eshop.util.Util;

public class Apple extends Item implements WeightItem {
    private double weight;

    public Apple(String name, double price, double weight){
        super(name, price);
        this.weight = weight;
    }
    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getItemPrice() {
        return weight*getPrice();
    }

    @Override
    public String toString() {
        return "Apple: " + getName() + ", Price per kg: " + getPrice() +
                ", Weight: " + weight + ", Price: " + Util.formatPrice(getItemPrice());
    }
}
