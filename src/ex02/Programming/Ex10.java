package ex02.Programming;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("물체의 무게를 입력하시오(킬로그램): ");
        int kg= sc.nextInt();
        System.out.print("물체의 속도를 입력하시오(미터/초): ");
        int speed= sc.nextInt();

        //double anergy= (double)0.5*kg*speed*speed; //다운캐스팅
        System.out.println("물체는"+(double)0.5*kg*speed*speed+" (줄)의 에너지를 가지고 있다.");
    }
}
