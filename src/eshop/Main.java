package eshop;

import eshop.coupon.Coupon;
import eshop.coupon.Reader;
import eshop.uncountable.*;
import eshop.countable.*;
import eshop.util.Util;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();
        cart.addItem(new Apple("Goldenky", 1.09, 1.5));
        cart.addItem(new Water("Baldovska", 0.89, 10));
        cart.addItem(new Peanuts("Peanuts", 0.62, 4));
        cart.addItem(new Peanuts("Peanuts", 0.62, 4));
        cart.printCart();
        System.out.println("Do you have coupon? y/n");
        String coupon;
        String input = sc.nextLine().toLowerCase();
        double totalPrice = cart.getTotalPrice();
        if (input.charAt(0)=='y'){
            System.out.println("Enter coupon code: ");
            coupon = sc.nextLine();
            List<Coupon> list = Reader.getListOfCoupons();
            totalPrice = cart.getTotalPrice();
            for (Coupon temp : list){
                if (temp.getCode().equalsIgnoreCase(coupon)){
                    System.out.println("Coupon is valid");
                    totalPrice = totalPrice*(1-(double)(temp.getValue())/100);
                    list.remove(temp);
                    break;
                }
            }
            Reader.updateCoupons(list);
        }
        System.out.println("Total price: " + Util.formatPrice(totalPrice));
        System.out.println("(Information price in SKK: " + Util.convertToSK(totalPrice) + ")");

    }
}
