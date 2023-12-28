package ex08.example.StringEx01;

public class StringEx01 {
    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; //Byte -> 14Byte
        String convert = "A2B3C4D5"; //Byte -> 8Byte 인코딩

        int startA=data.indexOf("A");
        int lastA=data.lastIndexOf("A");
        int countA;
        countA=lastA-startA+1;

        int startB=data.indexOf("B");
        int lastB=data.lastIndexOf("B");
        int countB;
        countB=lastB-startB+1;

        int startC=data.indexOf("C");
        int lastC=data.lastIndexOf("C");
        int countC;
        countC=lastC-startC+1;

        int startD=data.indexOf("D");
        int lastD=data.lastIndexOf("D");
        int countD;
        countD=lastD-startD+1;

        System.out.println("A"+countA+"B"+countB+"C"+countC+"D"+countD);





    }
}
