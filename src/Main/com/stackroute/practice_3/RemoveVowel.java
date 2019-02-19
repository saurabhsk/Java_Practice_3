package com.stackroute.practice_3;

public class RemoveVowel {

    public String[] findVowel(int n, String str[]) {

        for (int i = 0; i < n; i++) {
            str[i] = str[i].replaceAll("[aeiou]", "");
            //System.out.println(str[i]);
        }
        return str;
    }
}
