package com.abnamro.mulb.stream.Abstract;

public abstract class Car {
    //public abstract void drive();
    public void playMusic() {
        System.out.println("Playing music");
    }
}

class WagonR extends Car {
    //@Override
    public void drive() {
        System.out.println("Driving WagonR");
    }
}

