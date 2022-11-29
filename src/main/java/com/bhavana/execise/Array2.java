package com.bhavana.execise;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int a[]=new int[7];
        Arrays.fill(a,2);
        a[1]=23;
        for(int i:a){
            System.out.println(i);
        }
    }
}
