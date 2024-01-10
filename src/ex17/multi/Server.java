package ex17.multi;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            Socket socket = serverSocket.accept();

            Thread t1 = new Thread(() -> {
                    //T1
                try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        while(true) {
                            String requestMsg = br.readLine();
                            System.out.println("클라이언트로부터 받은 메시지 : " + requestMsg);
                            if (requestMsg.equals("끝")){
                                break;
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
            });
            t1.start();


            Thread t2 = new Thread(() -> {
                String msg = "1";
                try {
                    PrintWriter pw =new PrintWriter(socket.getOutputStream(), true);
                    Scanner sc = new Scanner(System.in);
                    while(true) {
                    //T2
                        msg = sc.nextLine();
                        pw.println(msg);
                        if (msg.equals("끝")){
                            break;
                        }
                    }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
            });
            t2.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
