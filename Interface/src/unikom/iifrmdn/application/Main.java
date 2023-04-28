package unikom.iifrmdn.application;

import unikom.iifrmdn.data.Avanza;
import unikom.iifrmdn.data.Car;

public class Main {

    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }


}
