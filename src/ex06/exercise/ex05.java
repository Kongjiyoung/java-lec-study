package ex06.exercise;

class ParentClass{
    public void test() {
        System.out.println("부모클래스 test()");
    }
}

class ChildClass extends ParentClass{
    public void test() {
        System.out.println("자식클래스 test()");
    }
}

public class ex05 {
    public static void main(String[] args) {
        ParentClass obj=new ParentClass();
        obj.test();
        ParentClass obj2=new ChildClass();
        obj2.test();
    }
}
