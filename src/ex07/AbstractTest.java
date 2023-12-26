package ex07;

abstract class Shape{
    int x,y;
    public void translate(int x, int y){
        this.x=x;
        this.y=y;
    }
    public abstract void draw();//추상메서드는 중괄호를 붙이지 않는다
}

class Rectangle extends Shape{
    int width,height;
    public void draw(){
        System.out.println("사각형 그리기 메소드");
    }
}

class Circle extends Shape{
    int radius;
    public void draw(){
        System.out.println("원 그리기 메소드");
    }
}
public class AbstractTest {
    //Shape s1=new shape();
    Shape s2=new Circle();
}

