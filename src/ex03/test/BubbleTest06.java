package ex03.test;

public class BubbleTest06 {
    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};

        final int N=arr.length;

        int temp;

        for (int loop = 1; loop < 5; loop++) {
            for (int i = 0; i < N-loop; i++) {
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

        //1회전
        for (int i = 0; i < N-1; i++) {
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        //2회전
        for (int i = 0; i < N-2; i++) {
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        //3회전
        for (int i = 0; i < N-3; i++) {
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        //4회전
        for (int i = 0; i < N-4; i++) {
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+ "  ");
        }
    }
}
