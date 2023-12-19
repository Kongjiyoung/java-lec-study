package ex04;

public class MethodEx01 {

    static void m1(){ //static : 메모리에 띄울려고
        System.out.println("m1");
    }

    static String m2(){
        System.out.println("m2");
        return "m2";//메서드 종료 뒤에는 실행이 안됨
        //System.out.println("m2"); // 실행안됨
    }

    public static void main(String[] args) {
        MethodEx01.m1();
        m1();//같은 클래스 안에 있으면 생략가능.
        m2();//***이 라인이 실행되는 순간 10,11번 라인이 내부가 열린다,메모리에 실행된다 실행이 끝나면 "m2"로 바뀐다***
        String result = m2();//=String result = "m2"; 이거랑 같다

        System.out.println("result : " + result);

    }
}
