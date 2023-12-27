package ex06.example7;

public class ShrimpBurger extends Burgger{

    private String material; //재료

    public ShrimpBurger(String name, int price, String material) {
        super(name, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
