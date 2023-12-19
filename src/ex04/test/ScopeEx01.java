package ex04.test;

public class ScopeEx01 {

    int n1=1;
    static int n2=2;

    static void m1(){
        int n5 = 10;
        System.out.println("m1 : "+n5); //static은 이미 호출됐지만 n1아직 떠있지않아서
    }

    void m2(){
        System.out.println("m2 : "+n1); //m2가 떴을때는 n1도 떴다는것
    }

    //메인 시작전에 static에 n1변수와 m1 메서드가 로드 되어 있음.
    public static void main(String[] args) { //System.out.println(n2); //원래는 클래스명.n2 ScopeEx01.n2 클래스명 생략가능
        System.out.println("1");
        m1();
        System.out.println("2");
        ScopeEx01 sc = new ScopeEx01();
        System.out.println(sc.n1);
        sc.m2();
    }
}
