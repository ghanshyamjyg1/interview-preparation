package SocketProgram;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiwayServer {
    private static final int PORT = 12345;
    private static Set<ClientHandler> clientHandlers = new HashSet<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is listening on port " + PORT);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                ClientHandler clientHandler = new ClientHandler(socket);
                clientHandlers.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void broadcast(String message, ClientHandler excludeUser) {
        for (ClientHandler clientHandler : clientHandlers) {
            if (clientHandler != excludeUser) {
                clientHandler.sendMessage(message);
            }
        }
    }

    static void removeClient(ClientHandler clientHandler) {
        clientHandlers.remove(clientHandler);
        System.out.println("The client disconnected");
    }

    static class ClientHandler implements Runnable {
        private Socket socket;
        private PrintWriter writer;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                OutputStream output = socket.getOutputStream();
                writer = new PrintWriter(output, true);

                String clientMessage;

                do {
                    clientMessage = reader.readLine();
                    String serverMessage = "Client: " + clientMessage;
                    System.out.println(serverMessage);

                    MultiwayServer.broadcast(serverMessage, this);

                } while (!clientMessage.equals("bye"));

                socket.close();
                MultiwayServer.removeClient(this);

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        void sendMessage(String message) {
            writer.println(message);
        }
    }
}
