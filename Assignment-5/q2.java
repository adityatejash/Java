// Q2. Write a program to demonstrate user-defined exceptions in Java.

class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class q2 {

    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            int age = 16;
            checkAge(age);
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}