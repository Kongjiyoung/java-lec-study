package ex07;

interface getInfo{
    void walk();
    void fly();
    void sing();
}

public class Bird implements getInfo{

    @Override
    public void walk() {
        System.out.println("Bird는 걸을 수 있음");
    }

    @Override
    public void fly() {
        System.out.println("Bird는 날 수 있음");
    }

    @Override
    public void sing() {
        System.out.println("Bird는 노래할 수 있음");
    }

    public static void main(String[] args) {
        Bird b1=new Bird();
        b1.walk();
        b1.fly();
        b1.sing();
    }
}
