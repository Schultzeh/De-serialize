package com.company;

import com.company.network.NetworkClient;
import com.company.network.NetworkServer;

import java.io.File;
import java.nio.file.StandardOpenOption;

public class Program {
    public Program() {

        NetworkServer networkServer = new NetworkServer();
        NetworkClient networkClient = new NetworkClient();

        Person p = new Person("Pelle", "Hundvakt", 8000);
        Car c = new Car("Honda", "Civic", 200);

        FileHandler.writeFile("person", p, StandardOpenOption.CREATE);
        FileHandler.readFile("person");

        FileHandler.writeFile("car", c);
        FileHandler.readFile("car");

        FileHandlerNetwork.sendObject(p, networkClient.getSocket());
        var p1 = FileHandlerNetwork.readObject(NetworkServer.clientSocket);

        FileHandlerNetwork.sendObject(c, networkClient.getSocket());
        var c1 = FileHandlerNetwork.readObject(NetworkServer.clientSocket);

        System.out.println(c1);
        System.out.println(p1);







    }
}
