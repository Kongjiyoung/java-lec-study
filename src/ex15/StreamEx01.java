package ex15;

import java.io.IOException;
import java.io.InputStream; //io : 하드디스크로입력, 모니터(파일 등등)출력

public class StreamEx01 {
    public static void main(String[] args) {
        InputStream input = System.in; //키보드랑 연결되어있음 System.in은 키보드로부터 input을 받는다는 소리
        //한바이트씩 받는다
        try {
            int value =input.read();
            System.out.println("받은 값 : " + (char)value); //캐스팅도 직접받아야한다
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
