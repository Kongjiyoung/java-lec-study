package ex02;

public class CastEx01 {
    public static void main(String[] args) {
        int n1 =1; //4Byte
        double d1=1.5; //8Byte

        n1 = 2;

        d1 = n1; //업캐스팅 묵시적 형 변환
        System.out.println(d1); //더블형으로 받아들이기 때문에 2.0

        //n1 = d1; 큰공간에서 작은 공간을 넣을 수 없음.
        n1 = (int)d1;//다운캐스팅
        System.out.println(n1);
    }
}
