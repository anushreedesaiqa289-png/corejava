package com.app.geometry;
public class Point2D{
    double x;
    double y;
   
    public Point2D(double x,double y){ this.x = x; this.y = y;}


    public String getDetails(){
        return String.format(" x = %f , y = %f ",this.x,this.y);
    }

    public boolean isEqual(Point2D others){
        if(this.x == others.x && this.y == others.y) return true;
        return false;
    }
    public double calculateDistance(Point2D others){
        return Math.sqrt(Math.pow(others.x - this.x, 2) + Math.pow(others.y - this.y, 2));
    }


}