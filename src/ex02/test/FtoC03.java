package ex02.test;

import java.util.Scanner;

public class FtoC03 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("=============================");
        System.out.println();
        System.out.print("번호를 선택하세요 : "); //줄바꿈없애기

        //1. 화씨 혹은 섭씨를 선택하는 로직
        Scanner sc = new Scanner(System.in);
        int selectedNum = sc.nextInt(); //변수를 만들때 정확한 단어로 만들기

        System.out.print(selectedNum==1 ? "화씨온도를 입력하세요" : "섭씨온도를 입력하세요");
        int temp = sc.nextInt();
        double result =
                selectedNum==1 ? (5.0/9.0 *(temp-32)) : (9.0/5.0*temp+32);
        System.out.println("온도는 : "+result);
    }
}
