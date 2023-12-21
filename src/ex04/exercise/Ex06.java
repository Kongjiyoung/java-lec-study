package ex04.exercise;
class Calcultation{
    int sum(int n1, int n2){
        return n1+n2;
    }
    int sum(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}
public class Ex06 {
    public static void main(String[] args) {
        Calcultation obj=new Calcultation();
        System.out.println(obj.sum(10,20,30));
        System.out.println(obj.sum(10,20));
    }
}
