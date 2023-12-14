package ex03;

public class PizzaTopping {
    public static void main(String[] args) {

        String [] toppings = {"Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon"};

//        for (int i = 0; i < 5; i++) {
//            System.out.print(toppings[i]+" ");
//        }
        for(String i : toppings){
            System.out.print(i+" ");
        }
    }
}
