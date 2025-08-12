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

        // Exercise 2 Mini Challenge
//        Dog myDog = new Dog();
//        System.out.println(myDog.breathe());
//        myDog.makeSound();

        /* Exercise 3
        * Predicted output:
        * --- Regular Editor ---
        * Opening a generic file.
        *
        * --- Code Editor ---
        * Applying syntax highlighting...
        * Opening a generic file.
        *
        * --- Polymorphic Editor ---
        * Applying syntax highlighting...
        * Opening a generic file.
        * */
//        Editor myEditor = new Editor();
//        CodeEditor myCodeEditor = new CodeEditor();
//        Editor polyEditor = new CodeEditor(); // Polymorphism
//
//        System.out.println("--- Regular Editor ---");
//        myEditor.openFile();
//
//        System.out.println("\n--- Code Editor ---");
//        myCodeEditor.openFile();
//
//        System.out.println("\n--- Polymorphic Editor ---");
//        polyEditor.openFile();

        // Exercise 3 Mini Challenge
        GameCharacter regularChar = new GameCharacter();
        ArmoredCharacter armoredChar = new ArmoredCharacter();

        regularChar.takeDamage(100);
        armoredChar.takeDamage(100);
    }
}