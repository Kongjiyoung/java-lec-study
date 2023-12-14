package ex02.Programming;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("x의 값을 입력하세요");
        int x = sc.nextInt();
        System.out.println("x의 값을 입력하세요");
        int y = sc.nextInt();
        int max=(x>y) ? x : y;
        int min=(x<y)?x:y;
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("두 수 의 합: "+ (x+y));
        System.out.println("두 수 의 차: "+ (x-y));
        System.out.println("두 수 의 곱: "+ (x*y));
        System.out.println("두 수 의 평군: "+ max);
        System.out.println("큰 수: "+ min);
    }
}
