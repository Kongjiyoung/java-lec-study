package ex02.test;

import java.util.Scanner;
public class FtoC02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("섭씨온도(세계표준 C)를 입력하시오: ");
        //1. 화씨온도 받기
        double temp=sc.nextDouble();
        //System.out.println(c);

        //2. 화씨 -> 섭씨 온도로 변환
        double result = 9.0/5.0*temp+32;
        System.out.println(result);
    }
}
