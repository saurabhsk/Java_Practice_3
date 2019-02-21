//Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
//        assume the digits are a string and use split()
//        Input: 98,96,95,94,93
//        Output: 98,96,95,94,93 non consecutive numbers
//        Input: 54,53,52,51,50,49,48
//        Output : 54,53,52,51,50,49,48 are consecutive numbers
//        Input: 1,2,3,4,5,6,6
//        Output: 1,2,3,4,5,6,6 non consecutive numbers
package com.stackroute.practice_3;

import java.util.Arrays;

public class ConsecutiveSeries {

    public boolean series(int n, String str) {
        // split method to store string as array elements
       String numbers[]  = str.split(",");

        // Arrays.sort method to sort the array

         Arrays.sort(numbers);

            int[] arr = new int[numbers.length];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(numbers[j]);  //converting string array to integer array
            }
            int k = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != k) {
                    return false;
                }
                k++;
            }
        return true;
        }

    }

