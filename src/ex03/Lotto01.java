package ex03;

import java.util.Arrays;
import java.util.Random;

public class Lotto01 {
    public static void main(String[] args) {
        int arr [] = new int[6];
        Random r=new Random();
        int num ;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                num = r.nextInt(6) + 1;
                arr[i] = num;
            } else {
                num=r.nextInt(6)+1;
                for (int j = 0; j < i;j++) {
                    if(arr[j]==num){
                        num=r.nextInt(6)+1;
                        j=-1;0
                    }
                }
                arr[i]=num;
            }
        }
        System.out.println(Arrays.toString(arr));//배열값 한번에 보여주는법
    }
}
