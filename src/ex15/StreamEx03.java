package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx03 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        try { //readline은 \n를 이용해 읽음 중요함!!!!!
            String line = br.readLine(); //readline이 한번에 읽을 때 \n까지 끊어읽음 읽을 때 반드시 \n로 끊어읽기때문에 중요함
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
