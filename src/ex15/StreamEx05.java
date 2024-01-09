package ex15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

// 상대 경로 : 실행되는 위치(일반적인 명)를 기반으로 경로 정하는 것
// 절대 경로 : 루트에서 부터 경로를 찾는것
// 윈도우 : C:\\workspace\\hello.txt
// 맥,리눅스 : /workspace/hello.txt
public class StreamEx05 { //이 파일이 실행되는 위치는 모른다, 일반적으로 자바에서는 프로젝트에서 실행됨
    public static void main(String[] args) {
        try {//D:\workspace\java_lec\study\out\production\study\ex15\hello.txt
            //BufferedReader br = new BufferedReader(new FileReader("D:\\workspace\\java_lec\\study\\src\\ex15\\hello.txt")); //절대경로
            BufferedReader br = new BufferedReader(new FileReader("src\\ex15\\hello.txt")); //상대경로 //new BufferedReader(타겟)

            String line = br.readLine();
            System.out.println(line);

            BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ex15\\input.txt")); //상대경로 //new BufferedReader(타겟)
            bw.write("안녕");
            bw.write("반가워\n");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}