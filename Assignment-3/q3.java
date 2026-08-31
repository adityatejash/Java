// Q3. Create a program using abstract classes and interfaces for shape area calculations.

interface ShapeInterface {
    double area();
}

abstract class Shape {
    abstract void display();
}

class Circle extends Shape implements ShapeInterface {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14159 * radius * radius;
    }

    void display() {
        System.out.println("Area of Circle = " + area());
    }
}

class Rectangle extends Shape implements ShapeInterface {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    void display() {
        System.out.println("Area of Rectangle = " + area());
    }
}

public class q3 {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(10, 4);

        c.display();
        r.display();
    }
}