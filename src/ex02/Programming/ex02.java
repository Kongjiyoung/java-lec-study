package ex02.Programming;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        System.out.print("마일을 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        double mile=sc.nextDouble();
        System.out.println(mile+"마일은 "+(mile*1.609)+"킬로미터입니다.");
    }
}
