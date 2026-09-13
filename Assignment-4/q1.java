// Q1. Write a Java program demonstrating the use of the super keyword and final keyword.

class Parent {
    int number = 10;

    void display() {
        System.out.println("Parent class display() method");
    }
}

class Child extends Parent {
    int number = 20;

    // final variable
    final int MAX_VALUE = 100;

    void show() {
        // Using super to access parent class variable
        System.out.println("Parent number: " + super.number);

        // Accessing child class variable
        System.out.println("Child number: " + number);

        // Using super to call parent class method
        super.display();

        // Accessing final variable
        System.out.println("Final value: " + MAX_VALUE);
    }
}

public class q1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}