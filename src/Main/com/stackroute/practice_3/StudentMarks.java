//Create a class called StudentMarks, which prompts user for the number of students, reads it
//        from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
//        grades of each of the students and saves them in an int array called stuGrades. Your program shall
//        check that the grade is between 0 and 100 else has to trow an error message.
package com.stackroute.practice_3;

import java.util.Scanner;
import java.io.*;

public class StudentMarks {
    private int numOfStudents;
    private int stuGrades[];

// Constructor
    public StudentMarks(int numOfStudents, int stuGrades[]){

        this.numOfStudents = numOfStudents;
        this.stuGrades = stuGrades;

    }

//Method
    public boolean marks() {

//checks if the array element is greater than no of studnts.
        try {
            if(stuGrades.length>numOfStudents){
                System.out.println("enter the correct no of marks");
                return true;

            }
// checks if the grades entered is between 0 and 100.
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
