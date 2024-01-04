package Coffee;

public class Customor { //

    private Barista barista;

    public Customor(Barista barista) { //컴퍼지션 문법,
        this.barista = barista;
    }

    public void order(String menuName){ //메인한테 리턴할 필요가 없음, 고객이 가져야하니깐
        Coffee coffee = barista.makeCoffee();
        System.out.println(coffee.name+"을 받았습니다");
    }
}
