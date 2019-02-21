//Write a program to set up an array of places, Loop round and remove the vowels. Display the new
//        words in console
//        Input:
//        India
//        United States
//        Germany
//        Egypt
//        czechoslovakia
//        Output:
//        Place Name without Vowels:0 Ind
//        Place Name without Vowels:1 Untd Stts
//
//        Place Name without Vowels:2 Grmny
//        Place Name without Vowels:3 Egypt
//        Place Name without Vowels:4 czchslvk
package com.stackroute.practice_3;

public class RemoveVowel {

    //code to find the string of array without vowel in it

    public String[] findVowel(int n, String str[]) {

        for (int i = 0; i < n; i++) {
            str[i] = str[i].replaceAll("[aeiou]", "");
        }
        return str;
    }
}
