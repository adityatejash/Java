
import java.util.*;

public class q1 {
    public static void main(String[] args) {

        // String class
        String str = "Hello Java";
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Replace: " + str.replace("Java", "World"));
        System.out.println("Substring: " + str.substring(0, 5));

        // StringBuffer class
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        System.out.println("After Append: " + sb);

        sb.insert(5, " World");
        System.out.println("After Insert: " + sb);

        sb.reverse();
        System.out.println("After Reverse: " + sb);

        // StringTokenizer class
        String data = "Java Python C++";
        StringTokenizer st = new StringTokenizer(data);

        System.out.println("Tokens:");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
