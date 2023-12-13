package ex02;
//만약 내가 만든 클래스를 쓰고 싶으면 import ex02.Add2; 를 하면 된다.
import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, sum;

        System.out.print("첫 번쨰 숫자를 입력하시오:");
        x = sc.nextInt();

        System.out.print("두 번쨰 숫자를 입력하시오:");
        y = sc.nextInt();

        sum = x+y;
        System.out.println(sum);
    }
}
