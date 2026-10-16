
package com.app.fruits;

public abstract class Fruit{
    String name;
    String color;
    double weight;
    boolean isFresh;

    Fruit(){}
    public abstract String taste();
    public String toString(){
        return String.format("%-10s %-10s %-10.2f", name,color,weight);
    }
}




