package ex06.example7;

public class Burgger {
    private String name;
    private int price;

    public Burgger(String name, int price) {
        this.name = name;
        this.price = price; //1000원으로 고정하면 안되는이유 자식클래스에서 가격이 고정된다
        System.out.println(name+"가 만들어졌어요");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
