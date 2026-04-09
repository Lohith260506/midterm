package com.example;
import java.io.*;
import java.net.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Socket App Running...");
    }

    public String transmit(String message, int port) throws IOException {
        
        try (ServerSocket server = new ServerSocket(port)) {
            return "Message '" + message + "' received on port " + port;
        }
    }
}
