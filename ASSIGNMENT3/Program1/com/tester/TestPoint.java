package com.tester;
import java.util.Scanner;
import com.app.geometry.Point2D;
public class TestPoint{
    public static void main(String[] args){
        double x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x and y cordinates of p1 ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        Point2D pt1 = new Point2D(x,y);

        System.out.println("Enter the x and y cordinates of p2 ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        Point2D pt2 = new Point2D(x,y);

        pt1.getDetails();
        pt2.getDetails();

        if(pt1.isEqual(pt2)){
            System.out.println("p1 and p2 are located at same pos ");
        }
        else{
            System.out.println( " Distance between p1 and p2 "+ pt1.calculateDistance(pt2) );
        }


    }
}