// Q1. Develop a Java application for exception handling using try-catch-finally, throw, and throws.

public class q1 {

    // Method using 'throws'
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            // Using 'throw'
            throw new Exception("Age must be 18 or above.");
        }
        System.out.println("Eligible to vote.");
    }

    public static void main(String[] args) {

        try {
            int age = 16;

            // Calling a method that uses 'throws'
            checkAge(age);

        } catch (Exception e) {
            // Handling the exception
            System.out.println("Exception caught: " + e.getMessage());

        } finally {
            // Always executed
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues normally.");
    }
}