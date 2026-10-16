/* 
    Q4 Write an enum type TrafficLight, whose constants (RED, 
    GREEN, YELLOW) take one parameter—the duration of the 
    light.Write a program to test the TrafficLight enum so that it 
    displays the enum constants and their durations.
*/
package com.sunbeam;
public enum Trafficlight{
    RED(30),YELLOW(2),GREEN(15);
    private final int duration;
    private Trafficlight(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return this.duration;
    }
    
}

