package ex08.example.StringEx01;

public class StringEx04 {
    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; //Byte -> 14Byte
        String data1="";
        String convert = "A2B3C4D5"; //Byte -> 8Byte 인코딩
        for (int i = 0; i < 8; i=i+2) {
            char a=convert.charAt(i);

            for (int j = 0; j < convert.charAt(i+1)-'0'; j++) {
                data1=data1+convert.charAt(i);
            }
        }
        System.out.println(data1);
    }
}
