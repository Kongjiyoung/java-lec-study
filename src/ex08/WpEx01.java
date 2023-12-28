package ex08;

public class WpEx01 {
    public static void main(String[] args) {
        int num =10;
        Integer n = 10; //레퍼런스 자료형
        double d2 = n.doubleValue(); //Integer는 메소드를 사용할 수 있음

        Integer obj = new Integer(100);
        int value = obj.intValue(); //
    }
}
