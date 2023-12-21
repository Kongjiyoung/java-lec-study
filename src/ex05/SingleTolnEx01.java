package ex05;

class President{

    static President instance = new President(); //메인이 실행되게전에 static을 띄우기 때문에 실행된다. 힙에 띄운다


    private President(){}
}

public class SingleTolnEx01 {
    public static void main(String[] args) {
        President p1 = President.instance;
        System.out.println(p1.hashCode());
        President p2 = President.instance;
        System.out.println(p2.hashCode());
    }
}
