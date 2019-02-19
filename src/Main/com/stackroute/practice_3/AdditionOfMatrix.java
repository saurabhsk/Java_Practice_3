package com.stackroute.practice_3;

public class AdditionOfMatrix {
    private int row;
    private int col;
    private int first[][];
    private int second[][];
    private int sum[][];

    public AdditionOfMatrix(int row, int col, int first[][], int second[][]) {
        this.row = row;
        this.col = col;
        this.first = first;
        this.second = second;
    }

    public boolean sumOfMatrix() {
        sum = new int[2][3];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = first[i][j] + second[i][j];
                //System.out.print(sum[i][j]+"\t");

            }
            //System.out.println();

        }
        return true;
    }


}
