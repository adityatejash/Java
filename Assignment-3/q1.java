// Demonstration of Single, Multilevel and Hierarchical Inheritance

// Q1. Design a program to demonstrate inheritance concepts (single, multilevel, hierarchical inheritance).

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    void moo() {
        System.out.println("Cow moos");
    }
}

// Main class
public class q1 {
    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel Inheritance
        System.out.println("\nMultilevel Inheritance:");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();

        // Hierarchical Inheritance
        System.out.println("\nHierarchical Inheritance:");

        Cat c = new Cat();
        c.eat();
        c.meow();

        Cow w = new Cow();
        w.eat();
        w.moo();
    }
}