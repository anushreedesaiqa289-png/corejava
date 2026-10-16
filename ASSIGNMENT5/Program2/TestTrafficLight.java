package com.sunbeam;

import com.sunbeam.Trafficlight;

public class TestTrafficLight {
    public static void main(String[] args){
        Trafficlight[] e = Trafficlight.values();

        for(Trafficlight t : e){
            System.out.println(t.ordinal()+" "+t.name()+" "+t.getDuration());
        }
    }
}
