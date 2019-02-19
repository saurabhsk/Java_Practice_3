package com.stackroute.practice_3;

import java.util.Scanner;

public class ExceptionsExample {

    public static void main(String[] args) {
        Scanner sc = null;

        try {
            int arr[] = new int[-10];
        } catch (Exception e) {
            System.out.println(e);
        }
        try{
            sc = new Scanner(System.in);
            System.out.println("Enter the array elements: ");
            int arr1[] = new int[5];
            for(int i=0;i<arr1.length;i++){
                arr1[i]=sc.nextInt();
            }
            System.out.println(arr1[6]);
        }catch (Exception e){
            System.out.println(e);
        }
        String ptr  = null;
        try{

            if(ptr.equals("Java"))
                System.out.println("ptr is not a null pointer");
            else{
                System.out.println("ptr is null");
            }
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
