
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            PrintWriter output = new PrintWriter(
                socket.getOutputStream(), true
            );

            BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );

            output.println("Hello from Client!");

            String response = input.readLine();
            System.out.println("Server: " + response);

            socket.close();

        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}