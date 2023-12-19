package ex03;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int arr [] = new int[6];
        Random r=new Random();
        int num ;

        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                num= r.nextInt(3)+1;
                arr[i]=num;
            }else{
                while(true){
                    num=r.nextInt(3)+1;
                    //1.처음것도 비교해야함
                    for (int j = 0; j < i; j++) {
                        if (arr[j] != num) {
                            arr[i] = num;
                            break;
                        }
                    }
                }

            }
        }



        System.out.println(Arrays.toString(arr));//배열값 한번에 보여주는법
    }
}
