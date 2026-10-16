/*
Q3) Write a Java program to replace the second element of a ArrayList with
the specified element.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class Program{
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("Yellow");
        list.add("Orange");
        System.out.print("Enter the new element  ");
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        list.set(1, data); // zero indexing 

        list.forEach(e->System.out.println(e));

    }
}