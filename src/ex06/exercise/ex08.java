package ex06.exercise;
class A4{
    public void print(){
        System.out.println("A");
    }
}
class B4 extends A4{
    public void print(){
        System.out.println("B");
        super.print();
    }
}
public class ex08 {
    public static void main(String[] args) {
        B4 obj =new B4();
        obj.print();

        A4 obj2 = new B4();
        obj2.print();
    }


}
