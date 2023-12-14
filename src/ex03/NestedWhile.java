package ex03;

import java.util.Scanner;

public class NestedWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){ //데몬
            System.out.print("정수를 입력하시오: ");

            int number = sc.nextInt();
            if(number == 99){
                break; //반복문을 벗어나기위한 인터럭트
            }
            if(number > 0){
                System.out.println("양수");
            }else if(number < 0){
                System.out.println("음수");
            }else{
                System.out.println("0");
            }

        }

    }
}
