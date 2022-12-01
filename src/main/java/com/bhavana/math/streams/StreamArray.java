package com.bhavana.math.streams;

import java.util.Arrays;

public class StreamArray {
    public static void main(String args[]) {
        String[] arr = {"expression", "java", "python", "collection", "datastructures", "examples"};
        Arrays.stream(arr).filter(n -> n.length() > 5).sorted().forEach(System.out::println);
    }
}
