package com.sunbeam;
public class TestCircle {
    public static  void main(String[] args){
        
        Circle c = new Circle(10,20,67); // this is ok
        System.out.println(c.getDiameter());
        System.out.println(c.getX());
        System.out.println(c.getY());

        Circle c1 = new Circle(10,20,-9); // this throws exception
        
    }
}
