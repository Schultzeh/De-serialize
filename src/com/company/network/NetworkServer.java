package com.company.network;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkServer implements Runnable {

    private final int PORT = 1234;
    public static Socket clientSocket;

    public NetworkServer(){
        Thread serverThread = new Thread(this);
        serverThread.start();
    }

    @Override
    public void run(){
        try{
            ServerSocket serverSocket = new ServerSocket(PORT);
            clientSocket = serverSocket.accept();
            System.out.println("Connection with " + clientSocket.getRemoteSocketAddress());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}