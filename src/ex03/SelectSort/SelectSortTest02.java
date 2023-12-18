package ex03.SelectSort;

public class SelectSortTest02 {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 4, 3};
        final int N = arr.length;
        int rep;
        int min;

        //1회전
        rep=0;
        min=rep;

        for (int i = rep+1; i < N; i++) {
            if (arr[min]>arr[i]) {// 5, 8, 2, 4, 3
                min=i;
            }
        }
        if(rep != min){
            int temp=arr[min];
            arr[min]=arr[rep];
            arr[rep]=temp;
        }

        //2회전
        rep=1;
        min=rep;

        for (int i = rep+1; i < N; i++) {
            if (arr[min]>arr[i]) {// 5, 8, 2, 4, 3
                min=i;
            }
        }
        if(rep != min){
            int temp=arr[min];
            arr[min]=arr[rep];
            arr[rep]=temp;
        }

        //3회전
        rep=2;
        min=rep;

        for (int i = rep+1; i < N; i++) {
            if (arr[min]>arr[i]) {// 5, 8, 2, 4, 3
                min=i;
            }
        }
        if(rep != min){
            int temp=arr[min];
            arr[min]=arr[rep];
            arr[rep]=temp;
        }

        //4회전
        rep=3;
        min=rep;

        for (int i = rep+1; i < N; i++) {
            if (arr[min]>arr[i]) {// 5, 8, 2, 4, 3
                min=i;
            }
        }
        if(rep != min){
            int temp=arr[min];
            arr[min]=arr[rep];
            arr[rep]=temp;
        }
    }
}
