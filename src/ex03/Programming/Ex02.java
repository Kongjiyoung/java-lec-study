package ex03.Programming;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연산을 입력하세요: ");
        char cal=sc.next().charAt(0);

        System.out.print("피연산자 2개를 입력하세요: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.print(num1+num2);
    }
}
