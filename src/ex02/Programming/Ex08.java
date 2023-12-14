package ex02.Programming;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("구의 반지름: ");
        double radius= sc.nextInt();
        System.out.println("구의 부피 : "+radius*4/3*3.14*radius*radius*radius);
    }
}
