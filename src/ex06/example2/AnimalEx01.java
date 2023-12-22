package ex06.example2;

class Animal{

    void speak(){
        System.out.println("멍멍");
    } //오버라이드 : 자식이 가지고 있는걸 확인해서 무효화 시키는 것
    void run(){
        System.out.println("달린다");
    }
}

class Cat extends Animal{
    //@Override //JVM이 인식하는 힌트 없어도 상관없음
    void speak() {//쉽게하는법 ctrl+엔터, alt+insert //재정의 : 애니멀이 가지고 있는 speak를 다시 정의하는거, 부모가 가지고 있는 메서드를 재정의해서 가린다.
        System.out.println("야옹"); //동적 바인딩
    }
}

public class AnimalEx01 {
    public static void main(String[] args) {
        Animal c1 =new Cat(); //[Cat, Animal] //다형성 : 메모리에서 내가 바라보는 포인터를 바꾸는거, 두가지이름을 가지는 거(animal,cat)
        c1.speak();
        c1.run();
    }
}
