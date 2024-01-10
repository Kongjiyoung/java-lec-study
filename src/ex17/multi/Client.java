package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 5000);

            Thread t1 = new Thread(() -> {
                //T1
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    while(true) {
                        String requestMsg = br.readLine();
                        System.out.println("서버로부터 받은 메시지 : " + requestMsg);
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
