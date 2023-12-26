package ex06;

class Parent{
    void print(){
        System.out.println("Parent 메소드 호출");
    }
}
class Child extends Parent{
    void print(){
        System.out.println("Child 메소드 호출");
    }
}
public class Casting {
    public static void main(String[] args) {
        Parent p = new Child(); //업캐스팅:자식객체를 부모객체로 형변환
        p.print();

        //Chile c =new Parent();

        Child c = (Child) p; //다운캐스팅
        c.print();
    }

}
