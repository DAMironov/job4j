package ru.job4j.calculate;

public class CarUsage {
    public static void main(String[] args) {
        Car audi = new Car();
        boolean driving = audi.canDrive();
        System.out.println("Can you drive?:" + driving);
        System.out.println("I am going toa gas station");
        int gas = 25;
        audi.fill(gas);
        driving = audi.canDrive();
        System.out.println("can you drive now?:" + driving);
        System.out.println("Now. Iam going to my granny");
        System.out.println("It`s 10 kilometer from here.");
        int distance = 10;
        audi.drevi(distance);
        audi.gasinfo();
    }
}