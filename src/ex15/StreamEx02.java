package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
//        InputStream in = System.in;
//        InputStreamReader ir = new InputStreamReader(in);
        InputStreamReader ir = new InputStreamReader(System.in);
        char [] ch = new char[4]; //보조스트림 역할

        //스트림을 읽는게 아니라 보조스트림을 읽어줌
        try {
            ir.read(ch);
            for(char c:ch){
                System.out.print(c+" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
