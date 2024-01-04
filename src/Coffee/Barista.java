package Coffee;

public class Barista {
    public Coffee makeCoffee(){ //바리스타와 손님끼리 객체끼리 협력하는관계
        return new Coffee();//이처럼 new는 필요한 사람한테 만들면 된다.
    }
}
