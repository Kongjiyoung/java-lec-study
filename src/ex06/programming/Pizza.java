package ex06.programming;

class Circle {
    protected int radius;
    public Circle(int r){
        this.radius=r;
    }
}

public class Pizza extends Circle{
    String menu;

    public Pizza(String m,int r) {
        super(r);
        this.menu=m;
    }
    public void print(){
        System.out.println("피자의 종류 : "+this.menu+", 피자의 크기 : "+super.radius);
    }

    public static void main(String[] args) {
        Pizza obj=new Pizza("Peppperoni", 20);
        obj.print();
    }
}
