package ex04;

class Cat{
    String name;

    Cat(){
        //this.name="토비";
        this("토비");//다른 생성자를 가르킨다
    }

    Cat(String name){
        this.name=name;
    }
}
public class HeapEx01 {
    public static void main(String[] args) {
        Cat c = new Cat();

    }
}
