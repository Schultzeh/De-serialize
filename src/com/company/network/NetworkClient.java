package com.company.network;

import java.io.IOException;
import java.net.Socket;

public class NetworkClient {

    private final int PORT = 1234;
    private final String HOST = "Localhost";
    public static Socket clientSocket;

    public NetworkClient(){
        try {
            clientSocket = new Socket(HOST, PORT);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Socket getSocket(){
        return this.clientSocket;
    }
}