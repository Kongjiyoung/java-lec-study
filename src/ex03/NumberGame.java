package ex03;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 38;
        int guess;
        int count=1;

        while(true){
            System.out.print("숫자를 입력하세요: ");
            guess = sc.nextInt();

            if(guess>answer){
                System.out.println("제시한 숫자보다 작습니다");
            }
            if(guess<answer){
                System.out.println("제시한 숫자보다 큽니다");
            }
            if(guess==answer){
                System.out.println("정답입니다. "+count+"번만에 성공했습니다");
                break;
            }
            count++;
        }
    }
}
