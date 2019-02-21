//Write a program to create a ChessBoard pattern with the help of multidimensional array, where
//        WWrepresents white color and BB represents Black color.
//        Output:
//        My Chess Board
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|
package com.stackroute.practice_3;

public class ChessPattern {

    public String  pattern(int row,int col){

        StringBuffer result = new StringBuffer(""); //Creating StringBuffer object to use with append method

        for(int i=0;i<row;i+=2){
            for(int j=0;j<col;j++){
                //checking for even places
                if(j%2==0){
                    result.append("WW|");
                }
                else{
                    result.append("BB|");
                }
            }
            result.append("\n");
            for(int j=0;j<col;j++){
                //checking for odd places.
                if(j%2==1){
                    result.append("WW|");
                }
                else{
                    result.append("BB|");
                }
            }
            result.append("\n");

        }

        return result.substring(0,result.length()-1);
    }
}
