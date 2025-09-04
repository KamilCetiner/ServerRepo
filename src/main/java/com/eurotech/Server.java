/*
package com.eurotech;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {

    private int port;

    public Server(int port) {
        this.port = port;
    }

    @Override
    public void run() {

        try (ServerSocket server = new ServerSocket(port)) {
            System.out.println("Sunucu başlatıldı, port: " + port);

            while (true) {
                Socket client = server.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

                String line = in.readLine();
                System.out.println("İstek: " + line);

                String html = "<html><body><h1>Merhaba Java Web Server!</h1></body></html>";
                out.write("HTTP/1.1 200 OK\r\n");
                out.write("Content-Type: text/html\r\n");
                out.write("Content-Length: " + html.length() + "\r\n");
                out.write("\r\n");
                out.write(html);
                out.flush();

                client.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    }

*/
