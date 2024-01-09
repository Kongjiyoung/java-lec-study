package ex17.oneway;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        //localhost = 127.0.0.1 (루프백)
        try {
            Socket socket = new Socket("127.0.0.1", 10000);

            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine();
            //문자 인코딩이라는 것은 버퍼에서 몇바이트씩 끊을 수 있는지 알려줌 , 버퍼read할때 알려준다,
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8")); //socket.getOutputStream() 1byte씩 전송 "UTF-8"한글로 설정해줌

            bw.write(msg+"\n"); //\n을 해야하는 이유 정리해놓기
            bw.flush(); //전송자체가 안됨
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
