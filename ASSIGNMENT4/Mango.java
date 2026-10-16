package com.app.fruits;

public class Mango extends Fruit{
    public Mango(String name,String color,double weight,boolean isFresh){
        this.name    =  name;
        this.color   =  color;
        this.weight  = weight;
        this.isFresh = isFresh;
    }
    public String taste(){
        return "Sweet";
    }
    public String getName(){
        return this.name;
    }
    public void setFresh(boolean val){
        this.isFresh = val;
    }
    public boolean getIsFresh(){
        return this.isFresh;
    }
    public void display(){
        System.out.println("Name     :"+this.name);
        System.out.println("Color    :"+this.color);
        System.out.println("weight   :"+this.weight);
        if(this.isFresh)
            System.out.println("Fruit is Fresh");
        else
            System.out.println("Fruit is Not Fresh");
        
    }
}