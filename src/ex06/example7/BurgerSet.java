package ex06.example7;
//결합관계
public class BurgerSet { //has Burger, Coke
    private Burgger burgger; //다른 객체를 여기 적어서 결합관계를 만든다
    private Coke coke;

    public BurgerSet(Burgger burgger, Coke coke) {
        this.burgger = burgger;
        this.coke = coke;
        System.out.println("버거세트가 만들어졌습니다");
    }

    public int getTotalPrice(){
        return burgger.getPrice()+coke.getPrice();
    }
    public Burgger getBurgger() {
        return burgger;
    }

    public Coke getCoke() {
        return coke;
    }
}
