package ex04;

/**
 * 아키텍처
 * 1. JVM메모리에 static을 찾는다. 넣는다
 * 2. .class를 불러온다
 * 3. class 공간을 만든다
 * 4. 공간에 static명 을 넣는다
 * 5. main을 실행시킨다
 * 6. main이 끝날 때까지 static은  띄워놓는다
 */
class Person1{//커스텀 자료형
    static int age = 20;
    static char gender = '여';
}
public class MemEx01 {
    public void main(String[] args) {
        System.out.println(Person1.age);
        System.out.println(Person1.gender);
    }
}
