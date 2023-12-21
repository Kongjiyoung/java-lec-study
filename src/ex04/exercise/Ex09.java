package ex04.exercise;

class Number{
    private int number;
    public int getNumber(){
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
public class Ex09 {
    public static void main(String[] args) {
        Number obj = new Number();
        obj.setNumber(100);
        System.out.println(obj.getNumber());
    }
}
