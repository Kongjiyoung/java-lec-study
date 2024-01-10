package ex17.multi2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(50000);
            Socket socket = serverSocket.accept();

            String requestMsg = "1";
            while(!(requestMsg.equals("끝"))) {
                        //T1
                        try {
                            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                            requestMsg = br.readLine();
                            System.out.println("클라이언트로부터 받은 메시지 : " + requestMsg);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
