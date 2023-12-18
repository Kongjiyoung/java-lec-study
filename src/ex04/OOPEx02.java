package ex04;

class Person4{
    //상태=변수
    private int weight = 100; //private 다른클래스에 접근을 못하게 하는것


    public  int getWeight(){ //weight는 private이기 때문에 행위를 통하여 접근하기 위해서 메서드를 하나 더 만들어준다.
        return weight;
    }

    //행위=메서드
    // pulic,private 접근제어자
    public void exercise(){//메서드이름()
        weight=weight-10; //상태는 행위에서 접근할 수 있음
    }

}
public class OOPEx02 {
    public static void main(String[] args) {
        Person4 p4= new Person4();
        System.out.println("p3의 몸무게: "+p4.getWeight());

        p4.exercise();
        System.out.println("p3의 몸무게: "+p4.getWeight());

        p4.exercise();//행위없이 상태를 접근할 수 있어서
        System.out.println("p3의 몸무게: "+p4.getWeight());

        p4.exercise();
        System.out.println("p3의 몸무게: "+p4.getWeight());

        p4.exercise();
        System.out.println("p3의 몸무게: "+p4.getWeight());

        p4.exercise();
        System.out.println("p3의 몸무게: "+p4.getWeight());

        p4.exercise();
        System.out.println("p3의 몸무게: "+p4.getWeight());

        p4.exercise();
        System.out.println("p3의 몸무게: "+p4.getWeight());

        p4.exercise();
        System.out.println("p3의 몸무게: "+p4.getWeight());

        p4.exercise();
        System.out.println("p3의 몸무게: "+p4.getWeight());

        p4.exercise();
        System.out.println("p3의 몸무게: "+p4.getWeight());

    }
}
