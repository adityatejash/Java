import java.util.*;

// Q1. Create a Java program using classes and objects to manage student information with methods for input and display.

class Student {
    String name;
    String enrolment_no;
    int age;
    double marks;

    void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();
        
        System.out.print("Enter Enrolment No: ");
        enrolment_no = sc.nextLine();
        
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
        
        System.out.println();
        
        sc.close();
    }
    
    void print(){
        System.out.println("---Student Information---");
        System.out.println("Name: " + name);
        System.out.println("Enrolment No: " + enrolment_no);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class q1 {
    public void main(){
        Student s = new Student();

        s.input();
        s.print();
    }
}
