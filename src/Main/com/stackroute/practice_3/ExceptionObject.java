package com.stackroute.practice_3;

public class ExceptionObject {

        public static void main(String[] args) throws MyException{
            try {
                    throw new MyException("Exception Error Message");
            }
            catch (Exception e) {
                System.out.println("Exception caught :: "+e);
            }
            finally{
                System.out.println("finally block");
            }
        }
    }
