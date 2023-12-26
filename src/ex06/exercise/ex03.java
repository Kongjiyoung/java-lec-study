package ex06.exercise;

class A1{
    protected void test(){
        System.out.println("A test()");
    }
}
class B1 extends A1{
    public void test(){
        System.out.println("B test()");
    }
}
public class ex03 {
    public static void main(String[] args) {
        B1 b=new B1();
        b.test();
    }
}
