package com.abnamro.mulb.stream.Abstract;

enum Laptop {
    DELL(2000),
    HP,
    LENOVO(1000);

    private final int price;

    private Laptop() {
        this.price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
public class Test {
    public static void main(String[] args) {
        for(Laptop lap : Laptop.values()) {
            System.out.println(lap + " Price: " + lap.getPrice());
        }
        Laptop lap = Laptop.HP;
        getLaptop(lap);
    }

    private static void getLaptop(Laptop lap) {
        System.out.println(lap.getClass().getSuperclass());
        switch (lap) {
            case DELL:
                System.out.println("Dell Laptop Price: " + lap.getPrice());
                break;
            case HP:
                System.out.println("HP Laptop Price: " + lap.getPrice());
                break;
            case LENOVO:
                System.out.println("Lenovo Laptop Price: " + lap.getPrice());
                break;
            default:
                System.out.println("Unknown Laptop.");
        }
    }
}
