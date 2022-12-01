package com.bhavs.streams;

import java.util.Arrays;

public class CountStream {
    public static void main(String args[]){

        String[] arr= {"expression", "java", "python", "collection", "datastructures", "examples", "language", "char"};
        String ss= String.valueOf(Arrays.stream(arr).filter(i->i.length()>5).count());
        System.out.println(ss);
    }
}
