package org.example;

public class Main {
    public static void main(String[] args) {
        /* Exercise 1
        * Predicted output:
        * Tuut, tuut!
        * I am a Generic Vehicle Mustang
        * */
//        Car myCar = new Car();
//        myCar.honk();
//        myCar.display();

        // Exercise 1 Mini Challenge
//        Bicycle myBicycle = new Bicycle();
//        System.out.print("Bicycle says: ");
//        myBicycle.honk();
//        System.out.print("Bicycle says: ");
//        myBicycle.ringBell();

        /* Exercise 2
        * Predicted output:
        * The area is: 78.5...
        * The area is: 24.0
        * */
//        Circle myCircle = new Circle();
//        System.out.println(myCircle.display());
//
//        Rectangle myRectangle = new Rectangle();
//        System.out.println(myRectangle.display());

        Dog myDog = new Dog();
        System.out.println(myDog.breathe());
        myDog.makeSound();
    }
}