package ex05;
class President{
    private int pr1;
    static President p1=new President();

    private President(){}
}
public class SingletonEx01 {
    public static void main(String[] args) {
        President p1=President.p1;
        System.out.println(p1.hashCode());

        President p2=President.p1;
        System.out.println(p1.hashCode());
    }
}
