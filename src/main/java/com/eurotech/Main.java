package com.eurotech;

import java.io.*;
import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws IOException {



        Tankstelle tankstelle = new Tankstelle(1, "Shell Misburg");

        tankstelle.addObserver(new BenzinDisplayFeld());
        tankstelle.addObserver(new DieselDisplayFeld());








        /* int port = 8080;

        Thread serverThread = new Thread(new Server(port));
        serverThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Client’i başlat
        Client client = new Client("localhost", port);
        client.connect();*/
    }


    }
