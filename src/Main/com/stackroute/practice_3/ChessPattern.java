package com.stackroute.practice_3;

public class ChessPattern {

    public String  pattern(int row,int col){
        StringBuffer result = new StringBuffer("");
        for(int i=0;i<row;i+=2){
            for(int j=0;j<col;j++){
                if(j%2==0){
                    result.append("WW|");
                }
                else{
                    result.append("BB|");
                }
            }
            result.append("\n");
            for(int j=0;j<col;j++){
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
