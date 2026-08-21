// Q1. Write a Java program to demonstrate basic syntax, variables, data types, operators, and control statements.

public class q1 {

    public static void main(String[] args) {

        // Variables and Data Types
        int age = 21;
        double marks = 85.5;
        char grade = 'A';
        boolean passed = true;
        String name = "Aditya";

        // Display variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);

        // Operators
        int a = 10;
        int b = 5;

        System.out.println("\nArithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));

        System.out.println("\nLogical Operators:");
        System.out.println("(a > 5 && b < 10): " + (a > 5 && b < 10));
        System.out.println("(a > 5 || b > 10): " + (a > 5 || b > 10));

        // Control Statement: if-else
        System.out.println("\nIf-Else Statement:");
        if (marks >= 40) {
            System.out.println("Student has passed.");
        } else {
            System.out.println("Student has failed.");
        }

        // Control Statement: switch
        System.out.println("\nSwitch Statement:");
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Needs Improvement");
        }

        // Control Statement: for loop
        System.out.println("\nFor Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Control Statement: while loop
        System.out.println("\nWhile Loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // Control Statement: do-while loop
        System.out.println("\nDo-While Loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}