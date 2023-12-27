package ex06.example7;

public class LotteApp {
    public static void main(String[] args) {
        Burgger b1=new Burgger("기본버거", 1000); // [Burger]
        Burgger b2=new ShrimpBurger("새우버거", 2000, "새우"); // [Burger, ShrimpBurger]
        Coke c1=new Coke("콜라", 1000);
        System.out.println();
        BurgerSet set1= new BurgerSet(new Burgger("기본버거", 1000), new Coke("콜라", 1000) );
        System.out.println("총 가격은 : "+set1.getTotalPrice());
//        System.out.println(set1.getBurgger().getPrice());
//        System.out.println(set1.getCoke().getPrice());
    }
}
