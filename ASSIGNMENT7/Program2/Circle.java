
package com.sunbeam;

class CircleDiameterNegative extends Exception{
    private String message;

    CircleDiameterNegative(String message){ 
        this.message = message;
    }
    public String getMessage(){
        return String.format("%s",message);
    }

    

}

public class Circle{

    private double myX;
    private double myY;
    private double myDiameter;

    Circle(){
        this.myX        = 0.0;
        this.myY        = 0.0;
        this.myDiameter = 100.0;
    }

    Circle(double x,double y,double dia){
        this.myX        = x;
        this.myY        = y;
        try{
            if( dia < 0 )
                throw new CircleDiameterNegative("Diameter cannot be negative");
            this.myDiameter = dia;
        }
        catch(CircleDiameterNegative c){
            System.out.println(c.getMessage());
        }
    }

    public double getX(){ return  this.myX; }
    public double getY(){ return  this.myY; }
    public double getDiameter(){ return  this.myDiameter; }

}