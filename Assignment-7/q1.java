
import java.io.*;

public class q1 {
    public static void main(String[] args) {
        try {
            // OutputStream: write bytes to a file
            FileOutputStream fos = new FileOutputStream("data.txt");
            String text = "Hello Java File Handling!";
            fos.write(text.getBytes());
            fos.close();

            // InputStream: read bytes from a file
            FileInputStream fis = new FileInputStream("data.txt");
            int ch;
            System.out.print("InputStream Output: ");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            fis.close();

            // Writer: write characters to a file
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Welcome to Java I/O Streams!");
            fw.close();

            // Reader: read characters from a file
            FileReader fr = new FileReader("data.txt");
            System.out.print("\nReader Output: ");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
