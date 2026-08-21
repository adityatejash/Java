// Q2. Implement constructor overloading and method overloading in a Java class.

class Student {
    String name;
    int age;

    Student(){
        name = "Unknown";
        age = 0;
    }
    
    Student (String name) {
        this.name = name;
        age = 0;
    }
    
    Student (String name, int age) {
        this.name = name;
        this.age = age;        
    }

    void print(){
        System.out.println(name);
        System.out.println(age);
    }

    void print(String comment){
        System.out.println(comment);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void print(String comment, int year){
        System.out.println(comment);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
    }
}

public class q2 {
    public void main (){
        Student s1 = new Student();
        Student s2 = new Student("Aditya Prakash");
        Student s3 = new Student("Aditya Prakash", 21);

        s1.print();
        System.out.println();
        
        s2.print("Student Details");
        System.out.println();

        s3.print("Student Details", 2026);
        System.out.println();
    }
}