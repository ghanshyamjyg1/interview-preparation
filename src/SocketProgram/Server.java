package SocketProgram;

import java.io.*;
import java.net.*;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is listening on port 12345");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            // Input and output streams for communication
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Communication loop
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Client: " + message);
                out.println("Server received: " + message);

                // Exit if client sends "bye"
                if ("bye".equalsIgnoreCase(message)) {
                    break;
                }
            }

            // Close resources
            socket.close();
            System.out.println("Client disconnected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
