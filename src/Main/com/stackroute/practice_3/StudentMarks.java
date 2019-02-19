package com.stackroute.practice_3;

import java.util.Scanner;
import java.io.*;

public class StudentMarks {
    private int numOfStudents;
    private int stuGrades[];

    public StudentMarks(int numOfStudents, int stuGrades[]){

        this.numOfStudents = numOfStudents;
        this.stuGrades = stuGrades;

    }


    public boolean Marks() {


        try {
            if(stuGrades.length>numOfStudents){
                System.out.println("enter the correct no of marks");
                return true;

            }

            for (int i = 0; i < numOfStudents; i++) {

                    if (stuGrades[i] <= 0 || stuGrades[i] > 100)
                        System.out.println("Enter marks between 0 and 100");
                    }
            return true;

        } catch (Exception e) {
            System.out.println(e);

        }
        return true ;
    }
}
