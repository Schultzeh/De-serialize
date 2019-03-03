package com.company;

import com.company.network.NetworkClient;
import com.company.network.NetworkServer;

import java.io.File;

public class Program {
    public Program() {

        NetworkServer networkServer = new NetworkServer();
        NetworkClient networkClient = new NetworkClient();

        Person p = new Person("Pelle", "Hundvakt", 8000);
        Car c = new Car("Honda", "Civic", 200);

        FileHandler.writeFile("car", c);
        FileHandler.readFile("car");

        FileHandler.writeFile("person", p);
        FileHandler.readFile("person");

        FileHandlerNetwork.sendFile(c, networkClient.getSocket());
        var p1 = FileHandlerNetwork.readFile(NetworkServer.clientSocket);

        System.out.println(p1);







    }
}
