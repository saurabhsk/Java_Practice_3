package com.stackroute.practice_3;

import java.util.Arrays;

public class ConsecutiveSeries {

    public boolean series(int n, String str[]) {
       String numbers[]  = new String[n];
        for (String s : str) {
             numbers = s.split(",");
//            System.out.println(Arrays.toString(numbers));
        }

            int[] arr = new int[numbers.length];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(numbers[j]);
            }
            int k = arr[0];
            //System.out.println(k);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != k) {
                    System.out.println("Numbers Are not consecutive");
                    return false;
                }
                k++;
            }
            System.out.println("Numbers Are Consecutive");
        return true;
        }

    }

