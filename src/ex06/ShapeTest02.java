package ex06;

class Shape2{
    public void draw(){
        System.out.println("shape 중의 하나를 그릴 예정입니다.");
    }
}

class Circle2 extends Shape2{
    public void draw(){
        super.draw();
        System.out.println("Circle를 그립니다.");
    }
}

public class ShapeTest02 {
    public static void main(String[] args) {
        Circle2 s = new Circle2();
        s.draw();
    }
}
