package ex08.example.StringEx01;

public class StringEx02 {
    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; //Byte -> 14Byte
        String convert = "A2B3C4D5"; //Byte -> 8Byte 인코딩
        int count=0;
        String convert1="";

        for (int k = 65; k < 69; k++) {
            convert1=convert1+(char)k;
            int start=data.indexOf((char)k);
            int last=data.lastIndexOf((char)k);
            count=last-start+1;
            convert1=convert1+count;
        }
        System.out.println(convert1);

    }
}
