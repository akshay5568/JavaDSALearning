package OOPS;

public class MethodOverloadind {
    public static void main(String[] args) {
        Vehicle c1 = new Car();
        Vehicle b1 = new Bike();
        c1.start();
        b1.start();
    }
}

class Vehicle{
    void start(){
        System.out.println("Vehical is starting...");
    }
}

class Car extends Vehicle{
    void start(){
        System.out.println("Car is Starting with key...");
    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println("Bike is Starting with kick...");
    }
}
