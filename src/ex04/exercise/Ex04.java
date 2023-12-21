package ex04.exercise;
class NumberBox{
    public int ivalue;
    public float fvalue;

    public NumberBox(int ivalue, float fvalue) {
        this.ivalue = ivalue;
        this.fvalue = fvalue;
    }
}
public class Ex04 {
    public static void main(String[] args) {
        NumberBox n1=new NumberBox(10, 1.2345F);
        System.out.println(n1.ivalue);
        System.out.println(n1.fvalue);
    }
}
