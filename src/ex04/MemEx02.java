package ex04;

class Person2{ //커스텀타입 : 내가 만든 타입
    int age=10;
    char gender='남';
}



public class MemEx02 {
    public static void main(String[] args) {
        System.out.println("1년지남"); //문자는 '', 문자열은 ""
        System.out.println("2년지남");
        System.out.println("3년지남");

        //new Person2(); //new 클래스명
        //new Person2(); //static과 다르게 클래스명.변수명으로 찾을 수 없다
        //new Person2(); //
        //new를 써서 동적할당함
        //p는 변수를 선언하는데, 변수 앞에 자료형이 필요하기 때문에 커스텀 타입을 넣는다
        Person2 p = new Person2();
        System.out.println(p.age);
        System.out.println(p.gender);
        System.out.println("메인 종료");
    }
}
