package eshop;

import eshop.uncountable.*;
import eshop.countable.*;
import eshop.util.Util;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem(new Apple("Goldenky", 1.09, 1.5));
        cart.addItem(new Water("Baldovska", 0.89, 10));
        cart.addItem(new Peanuts("Peanuts", 0.62, 4));
        cart.printAll();
        System.out.println("(Information price in SKK: " + Util.convertToSK(cart.getTotalPrice()) + ")");

    }
}
