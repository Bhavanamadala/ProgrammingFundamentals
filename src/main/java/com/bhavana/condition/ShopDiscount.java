package com.bhavana.condition;

import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {

        double discount =10 , price=100 ;
        double quantity ;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Quantity: ");
        quantity=sc.nextInt();
        double totalCost = quantity*price;
        System.out.println("totalCost: "+totalCost);
        discount = totalCost/10;
        System.out.println("discount: "+discount);
    }


}
