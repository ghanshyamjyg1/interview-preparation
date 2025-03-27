package SocketProgram;

import java.io.*;
import java.net.*;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            System.out.println("Connected to the server");

            // Input and output streams for communication
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Console input for user
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            // Communication loop
            String message;
            while (true) {
                System.out.print("Enter message: ");
                message = consoleInput.readLine();
                out.println(message);

                String response = in.readLine();
                System.out.println(response);

                // Exit if user types "bye"
                if ("bye".equalsIgnoreCase(message)) {
                    break;
                }
            }

            // Close resources
            socket.close();
            System.out.println("Disconnected from the server");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
