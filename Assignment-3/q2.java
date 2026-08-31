// Q2. Develop a Java application to demonstrate method overriding and runtime polymorphism.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Method Overriding
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class q2 {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}