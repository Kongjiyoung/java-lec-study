package ex13;
//제네릭에는 static을 못 쓴다.
class Box <T>{
    T data;
}
public class GenericEx01 {
    public static void main(String[] args) {
        Box<String> box1=new Box();
        Box<Integer> box2 = new Box();

        box1.data="박스";
        box2.data=1;
    }
}
