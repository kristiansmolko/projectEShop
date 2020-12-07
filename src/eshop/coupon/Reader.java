package eshop.coupon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    private static String fileName = "resources/coupon.txt";

    public static List<Coupon> getListOfCoupons(){
        List<Coupon> list = new ArrayList<>();
        try{
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                String[] array = data.split(" ");
                Coupon newCoupon = new Coupon(array[0], Integer.parseInt(array[1]));
                list.add(newCoupon);
            }
            sc.close();
        }catch(Exception e){e.printStackTrace();}
        return list;
    }

    public static void updateCoupons(List<Coupon> list){
        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file);
            for (Coupon temp : list){
                fw.write(temp.getCode() + " " + temp.getValue() + "\n");
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
