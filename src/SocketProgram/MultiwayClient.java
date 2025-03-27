package SocketProgram;

import java.io.*;
import java.net.*;

public class MultiwayClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT)) {
            System.out.println("Connected to the server");

            new ReadThread(socket).start();
            new WriteThread(socket).start();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static class ReadThread extends Thread {
        private BufferedReader reader;
        private Socket socket;

        public ReadThread(Socket socket) {
            this.socket = socket;

            try {
                InputStream input = socket.getInputStream();
                reader = new BufferedReader(new InputStreamReader(input));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        public void run() {
            while (true) {
                try {
                    String response = reader.readLine();
                    System.out.println(response);
                } catch (IOException ex) {
                    ex.printStackTrace();
                    break;
                }
            }
        }
    }

    static class WriteThread extends Thread {
        private PrintWriter writer;
        private Socket socket;

        public WriteThread(Socket socket) {
            this.socket = socket;

            try {
                OutputStream output = socket.getOutputStream();
                writer = new PrintWriter(output, true);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        public void run() {
            Console console = System.console();

            String text;

            do {
                text = console.readLine();
                writer.println(text);

            } while (!text.equals("bye"));

            try {
                socket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

