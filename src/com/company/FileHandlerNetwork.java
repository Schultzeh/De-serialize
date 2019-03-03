package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandlerNetwork {

    public FileHandlerNetwork(){}

    public static void sendFile(Object serializableObject, Socket socket){
    try (ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())){
        oos.writeObject(serializableObject);
        System.out.println("Sent over network");
    } catch (IOException e){
        e.printStackTrace();
        }
    }


    public static Object readFile(Socket socket){
        try (ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())){
            return ois.readObject();
        }   catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
    }

