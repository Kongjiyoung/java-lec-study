package ex17.oneway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000); //소켓생선
            Socket socket = serverSocket.accept(); //리스너 (누가 나한테 요청을 하는지 확인중) // 소켓은 최소 두개다 이 소켓은 클라이언트가 연결하면 생김
            System.out.println("클라이언트 연결됨");
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8")); //프로토콜은 서로 알려줘야함 (UTF-8)
            String msg = br.readLine();
            System.out.println(msg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
