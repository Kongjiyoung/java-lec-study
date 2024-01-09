package ex15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("안녕\n"); //readline이 한번에 읽을 때 \n까지 끊어읽음
            bw.write("반가워\n"); //연속적으로 들어감
            bw.flush(); //데이터가 아직 다 안차서 강제로 보냄
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
