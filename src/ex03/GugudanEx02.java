package ex03;

import java.util.Scanner;

public class GugudanEx02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("원하는 구구단의 단수를 입력하세요: ");
        int x=sc.nextInt();

        for(int y=2; y<10; y++) {
            System.out.println(x + "*" + y + "=" + (x * y));
        }


    }
}
