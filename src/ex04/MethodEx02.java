package ex04;

public class MethodEx02 {

    static void m3(int n1){ //투입구가 하나 있을 때
        System.out.println("m3 : "+ n1);
    }

    static void m4(int n1, int n2){ //투입구를 파라미터(매개변수)라고 부름
        System.out.println("m4 : "+ n1);
        System.out.println("m4 : "+ n2);
    }


    public static void main(String[] args) {
        m3(1);
        m4(1, 2); //아규먼트 arguments(동전)
    }
}
