package ex08;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        int result= 0;
        try {
            result = 10/num;
        } catch (Exception e) {
//            System.out.println("0으로 나누면 안되요");
//            System.out.println(e.getMessage());
//            System.out.println(e.getCause());
//            System.out.println(e.getClass());
//            e.printStackTrace(); //오류코드 나오게 한다
            throw new RuntimeException("0으로 나눌 수 없어요"); //강제로 메시지 담기
        }
        System.out.println("나눗셈 결과 : "+ result);
    }

}
