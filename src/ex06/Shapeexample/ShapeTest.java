package ex06.Shapeexample;

class Shape{
    protected int x,y;
    public void draw(){
        System.out.println("Shape Draw");
    }
}

class Rectangle extends Shape{
    private  int width, height;
    public void draw(){
        System.out.println("Rectangle Draw");
    }
}

class Triangle extends Shape{
    private int base, height;
    public void draw() {
        System.out.println("Triangle Draw");
    }
}
class Circle extends Shape{
    private int radius;
    public void draw(){
        System.out.println("Circle Draw");
    }
}

public class ShapeTest {
    public static void print(Object obj){
        System.out.println("x="+obj.getClass()+"y="+obj.getClass());
    }
    public static void print1(Shape obj){
        if(obj instanceof Rectangle){
            System.out.println("실제 타입은 Rectangle");
        }
        if(obj instanceof Triangle){
            System.out.println("실제 타입은 Triangle");
        }
        if(obj instanceof Circle){
            System.out.println("실제 타입은 Circle");
        }
    }
    public static void main(String[] args) {
        Shape [] arrayOfShape;
        arrayOfShape = new Shape[3];

        arrayOfShape[0]=new Rectangle();
        arrayOfShape[1]=new Triangle();
        arrayOfShape[2]=new Circle();

        for (int i = 0; i < arrayOfShape.length; i++) {
            print(arrayOfShape[i]);
        }
    }
}
