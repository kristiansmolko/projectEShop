package eshop;

public abstract class Item {
    private String name;
    private double price;

    public Item(String name, double price){
        this.price = price;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public abstract double getItemPrice();
}
