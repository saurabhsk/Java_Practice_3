//Write a program to compute the addition of two matrix, Read the number of rows and columns
//        as input, also the values of each matrix
//        Output:
//        Input number of rows of matrix: 3
//        Input number of columns of matrix: 2
//        Input elements of first matrix: 1 2 3 4 5 6
//        Input the elements of second matrix: 9 8 7 6 5 4
//        Sum of the matrices:-
//        10 10
//        10 10
//        10 10
package com.stackroute.practice_3;

public class AdditionOfMatrix {
    //Instance variables
    private int row;
    private int col;
    private int first[][];
    private int second[][];
    private int sum[][];

 //constructor

    public AdditionOfMatrix(int row, int col, int first[][], int second[][]) {
        this.row = row;
        this.col = col;
        this.first = first;
        this.second = second;
    }
// adding two matrix and storing in third matrix
    public boolean sumOfMatrix() {
        sum = new int[2][3];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = first[i][j] + second[i][j];


            }
        }
        return true;
    }


}
