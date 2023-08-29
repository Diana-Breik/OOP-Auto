package org.example;

import java.util.Scanner;

public class Auto {
    String marke;
    String model;
    String color;
    int contructionYear;
    int  speed = 0;

    //Methoden
    public void startTheCar(){
        System.out.println("Das Auto startet nun, gute Fahrt! :)");
    }
   public void increaseSpeed(int amountOfSpeedIncrease){
        this.speed = speed+amountOfSpeedIncrease;
       System.out.println("Die jetzige Geschwindigkeit ist: " + speed);
   }
    public void decreasedSpeed(int amountOfSpeedDecrease){
        this.speed = speed-amountOfSpeedDecrease;
        System.out.println("Die jetzige Geschwindigkeit ist: " + speed);
    }
}
