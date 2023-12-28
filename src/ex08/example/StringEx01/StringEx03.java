package ex08.example.StringEx01;

public class StringEx03 {
    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; //Byte -> 14Byte
        // convert = "A2B3C4D5"; //Byte -> 8Byte 인코딩
        int count;
        //인코딩 --> 디코딩해보기
        String convert="";
        for (int j = 65; j < 69; j++) {
            count=0;
            convert=convert+(char)j;
            for (int i = 0; i < data.length(); i++) {
                if ((char)j == data.charAt(i)) {
                    count++;
                }
            }
            convert=convert+count;
        }
        System.out.println(convert);
    }
}
