package ex06;

class Animal1{
    public static void A(){
        System.out.println("static method in Animal");
    }
}

public class Dog1 extends Animal1 {
    public  static void A(){
        System.out.println("Static method in Dog");
    }
    public static void main(String[] args){
        Dog1 dog = new Dog1();
        Animal1 a =dog;
        a.A();
        dog.A();
    }
}
