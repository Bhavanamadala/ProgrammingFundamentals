package com.bhavs;

import java.util.Arrays;

public class Exercise {
        public static void main(String args[]) {

            int[] arr = {2, 5, 7, 8, 7, 5, 31, 9, 8, 5};
            Arrays.stream(arr).filter(i -> i % 2 == 0).map(n -> n * 2).forEach(System.out::println);

        }

    }
