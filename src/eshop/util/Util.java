package eshop.util;

public class Util {
    public static double convertToSK(double price){
        return formatPrice(price*30.126);
    }

    public static Double formatPrice(double price){
        return (Math.round(price*100))/100.0;
    }
}
