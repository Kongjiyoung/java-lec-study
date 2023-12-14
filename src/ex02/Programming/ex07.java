package ex02.Programming;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("받은 돈: ");
        int money= sc.nextInt();
        System.out.print("상품 가격: ");
        int price= sc.nextInt();
        System.out.println("부가세: "+price/10);
        System.out.println("잔돈: "+ (money-price));
    }
}
