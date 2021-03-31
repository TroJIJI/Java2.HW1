package com.geektech;

import java.util.Random;

public class Car extends Transport{
    private Name name;
    private int cost;
    public Car(){

    }

    public Car(Name name,int cost){
        this.name=name;
        this.cost=cost;
    }
    public Name getName(){
        return getName();
    }

    public int getCost() {
        return cost;
    }
    public void race(int time,int speed){
        System.out.println("разгон "+time +"сек"+ " до "+speed + "км/ч");
    }
    public void race(int time){
        System.out.println(time);
    }
    public String getInfo(){
        return "name = "+ name+"\ncost = "+ cost;
    }
}

