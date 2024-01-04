package Coffee;

public class CoffeeApp { //Barista, Customor는 메인에 만든다. //new에 책임은 필요한 클래스에게 있다..?
    public static void main(String[] args) {
        Barista barista = new Barista();
        Customor customor = new Customor(barista);//손님이 바리스타 의존하는 관계(고객은 바리스타 요청하는 관계) = 손님은 바리스타가 없으면 커피를 못먹음

        customor.order("아메리카노");
    }
}
