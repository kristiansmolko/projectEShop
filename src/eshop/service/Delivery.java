package eshop.service;

import eshop.Item;

public class Delivery extends Item implements Service{

    public Delivery(double price) {
        super("Delivery", price);
    }

    @Override
    public double getItemPrice() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "Delivery, Price: " + getPrice();
    }
}
