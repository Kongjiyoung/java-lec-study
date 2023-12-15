package ex03.test;

public class BubbleTest01 {
    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};

        final int N=arr.length; // 상수(변하지 않는 값)는 대문자로 붙인다.

        //첫번쨰 도전 4바퀴 돌기
        for (int i = 0; i < N-1; i++) {
            //System.out.println("몇번돌지?");
        }
        //두번째 도전 4번째 돌고, 내부적으로 4바퀴 돌기
        for (int i = 0; i < N-1; i++) {

            for (int j = 0; j < N-1; j++) {
                System.out.println("몇번돌지?");
            }
            System.out.println();
        }
        //세번째 도전 4번쨰 돌고, 내부적으로 4,3,2,1바퀴돌게 만들기
    }



}
