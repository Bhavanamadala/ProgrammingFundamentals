package com.bhavana.execise;

public class CompareTwoStringVariables {
    public static void main(String[] args) {

        String s1=new String("Bhavana");
        String s2=new String("Madala");

        String s3=new String("Madala");
        String s4=new String("Bhavs");

        System.out.println(s1.equals(s2));

        System.out.println(s3.equalsIgnoreCase(s4));

    }
}
