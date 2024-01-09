package ex15;


import java.io.*;

//상대경로 : 내 파일(.class)에 위치를 기반으로 경로 정하는 것 out기반으로 파일을 찾는다..?
//절대경로 : 루트에서 부터 경로를 찾는 것
//윈도우 : C:\workspace\hello.txt
//맥, 리눅스 : /workspace/hello.txt
public class StreamEx06 {
    public static void main(String[] args) {
//        System.out.println("안녕 난 \"홍길동\"이야"); // \를 써서 문자로 표현해라하고 한다
//        System.out.println("");

                BufferedReader inputStream = null;
                PrintWriter outputStream = null;

                try {
                    inputStream = new BufferedReader(new FileReader("D:\\workspace\\java_lec\\study\\src\\ex15\\input.txt"));
                    outputStream = new PrintWriter(new FileWriter("D:\\workspace\\java_lec\\study\\src\\ex15\\output.txt"));
                    String line;
                    while ((line = inputStream.readLine()) != null) {
                        outputStream.println(line);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (outputStream != null) {
                            outputStream.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
