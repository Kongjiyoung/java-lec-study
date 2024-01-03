package ex13;

abstract class Animal {
    abstract void speack();
}

class Dog extends Animal {
    public String name;
    public int age;
    @Override
    void speack() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public String name;
    public int age;
    @Override
    void speack() {
        System.out.println("야옹");
    }
}
public class GenericEx03 {
    public static void main(String[] args) {
        Animal[] arr= new Animal[2];
        arr[0]=new Dog();
        arr[1]=new Cat();

        Animal d1 = (Dog) arr[0];
        Animal c1 = (Cat) arr[1];

        d1.speack();
        c1.speack();
    }
}
