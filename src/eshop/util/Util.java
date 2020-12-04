package eshop.util;

public class Util {
    public static double convertToSK(double price){
        return formatPrice(price*30.126);
    }

    public static Double formatPrice(double price){
        double result =  (Math.round(price*100))/100.0;
        //String ret = String.valueOf(result);
        return result;
    }
}
