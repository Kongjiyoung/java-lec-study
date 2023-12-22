package ex06.example;

class Animal{

    void speak(){
        System.out.println("멍멍");
    }
    void run(){
        System.out.println("달린다");
    }
}

class Cat extends Animal{
    //@Override //JVM이 인식하는 힌트 없어도 상관없음
    void speak() {//쉽게하는법 ctrl+엔터, alt+insert //부모가 가지고 있는 메서드를 재정의해서 가린다.
    }
}

public class AnimalEx01 {
    public static void main(String[] args) {
        Cat c1 =new Cat();
        c1.speak();
        c1.run();
    }
}
