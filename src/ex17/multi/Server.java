package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Socket socket = serverSocket.accept();
            //소켓 연결완료

            //버퍼 만들기
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            //2. 메시지 받기 스레드
            new Thread(()->{
                while(true) {
                    try {
                        String requestMsg = br.readLine();
                        System.out.println("클라이언트로부터 받은 메시지 : " + requestMsg);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }
            }).start();


            //버퍼만들기 동기적실행(응답을 받으면 실행)
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true, Charset.forName("UTF-8"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
