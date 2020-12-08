package eshop.uncountable;

import eshop.Item;
import eshop.util.Util;

public class Peanuts extends Item implements WeightItem{
    private double weight;

    public Peanuts(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getItemPrice() {
        return weight*getPrice();
    }

    @Override
    public String toString() {
        return "Peanuts: " + getName() + ", Price per kg: " + getPrice() +
                ", Weight: " + weight + ", Price: " + Util.formatPrice(getItemPrice());
    }
}
