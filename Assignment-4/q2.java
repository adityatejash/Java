// Q2. Implement wrapper classes and type conversion operations in Java.

public class q2 {
    public static void main(String[] args) {

        // Wrapper Classes
        Integer intObj = 10;
        Double doubleObj = 20.5;
        Character charObj = 'A';
        Boolean boolObj = true;

        System.out.println("Wrapper Classes:");
        System.out.println("Integer: " + intObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Character: " + charObj);
        System.out.println("Boolean: " + boolObj);

        // Autoboxing: primitive -> wrapper
        int num = 50;
        Integer boxedNum = num;

        // Unboxing: wrapper -> primitive
        Integer value = 100;
        int unboxedValue = value;

        System.out.println("\nAutoboxing: " + boxedNum);
        System.out.println("Unboxing: " + unboxedValue);

        // Type Conversion
        // Widening conversion: int -> double
        int a = 25;
        double b = a;

        System.out.println("\nWidening Conversion:");
        System.out.println("int value: " + a);
        System.out.println("double value: " + b);

        // Narrowing conversion: double -> int
        double x = 45.67;
        int y = (int) x;

        System.out.println("\nNarrowing Conversion:");
        System.out.println("double value: " + x);
        System.out.println("int value: " + y);

        // String to primitive conversion
        String str = "123";
        int convertedInt = Integer.parseInt(str);
        double convertedDouble = Double.parseDouble("45.67");

        System.out.println("\nString Conversion:");
        System.out.println("String to int: " + convertedInt);
        System.out.println("String to double: " + convertedDouble);

        // Primitive to String conversion
        int number = 500;
        String convertedString = String.valueOf(number);

        System.out.println("int to String: " + convertedString);
    }
}