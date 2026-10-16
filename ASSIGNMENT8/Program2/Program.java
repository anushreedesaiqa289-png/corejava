/*
Q2) Write a Java program to create a new array list, add some colors (string)
and print out the collection as sorted list.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
        Collections.sort(list);
        list.forEach(e->System.out.println(e));

    }
}