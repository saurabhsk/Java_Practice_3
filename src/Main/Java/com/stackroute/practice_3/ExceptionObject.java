//Create a class with a main( ) that throws an object of class Exception inside a try block.
//        a. Give the constructor for Exception a String argument.
//        b. Catch the exception inside a catch clause and print the String argument.
//        c. Add a finally clause and print a message to prove you were there.

package com.stackroute.practice_3;

public class ExceptionObject {

        public static void main(String[] args) throws MyException{
            //use of throw keyword
            try {
                    throw new MyException("Exception Error Message");
            }
            catch (Exception e) {
                System.out.println("Exception caught :: "+e);
            }
            //finally block
            finally{
                System.out.println("finally block");
            }
        }
    }
