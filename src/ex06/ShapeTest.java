package ex06;

class Shape01{
    public void draw(){
        //System.out.println("Shape");
    }
}

class Circle1 extends Shape01{
    @Override
    public void draw() {
        System.out.println("Circle을 그립니다.");
    }
}

class Rectangle extends Shape01{
    @Override
    public void draw() {
        System.out.println("Rectangle을 그립니다.");
    }
}

class Triangle extends Shape01{
    public void draw(){
        System.out.println("Triangle을 그립니다.");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle s = new Rectangle();
        s.draw();
    }
}
