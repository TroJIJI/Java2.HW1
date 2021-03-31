package com.geektech;

public class Main {

    public static void main(String[] args) {
    Car car = new Car(Name.TOYOTA,60000);
    car.race(3,100);
        System.out.print(car.getInfo());
        System.out.println("\n_____________________");

        Characteristic characteristic = new Characteristic(3.5,220);
        Car1 bmw = new Car1(characteristic,"x5",Name.BMW,20000);
        System.out.println(bmw.getInfo());
        car.race(4,100);
        System.out.println("\n_____________________");

        Characteristic characteristic1 = new Characteristic(4.7,240);
        Car1 lexus = new Car1(characteristic1,"LX570",Name.LEXUS,80000);
        System.out.println(lexus.getInfo());
        car.race(3,100);





    }
}
