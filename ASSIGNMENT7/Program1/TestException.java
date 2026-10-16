package ASSIGNMENTS.ASSIGNMENT7.Program1;
import java.util.Scanner;

import com.sunbeam.ExceptionLineTooLong;
/*
Q1) Define a new exception, called ExceptionLineTooLong, that prints out the error message 
"The strings is too long". Write a program that reads a String from user and calculates its length. 
and throws an exception of type ExceptionLineTooLong in the case where a string of
 length is more than 80 characters. 
*/

public class TestException {
    public static  int a=30;
    public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
        String data = sc.nextLine();
            if(data.length() > 80)
                throw new ExceptionLineTooLong();
            System.out.print("The string has length under 80");
    }
    catch(ExceptionLineTooLong e){
        System.out.print(e.getMessage());
    }
}
    }
