package ex17.multi2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 10000);



                    String msg = "1";
                    while(!(msg.equals("끝"))) {
                        //T2
                        Scanner sc = new Scanner(System.in);
                        msg = sc.nextLine();

                        PrintWriter pw = null;
                        try {
                            pw = new PrintWriter(socket.getOutputStream(), true);
                            pw.println(msg);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
