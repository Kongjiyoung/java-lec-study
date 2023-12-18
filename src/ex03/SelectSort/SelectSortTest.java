package ex03.SelectSort;

public class SelectSortTest {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 4, 3};
        final int N = arr.length;

        //  변경해야할 위치 5--> replace -> rep

        // 변경해야할 위치 8 --> min -> min

        final int rep=0;
        int min=rep;

        if (arr[0]>arr[1]) {// 5, 8, 2, 4, 3
            min=1;
        }
        if (arr[2]>arr[2]) {// 5, 8, 2, 4, 3 min=2
            min=2;
        }
        if (arr[2]>arr[3]) {// 5, 8, 2, 4, 3 min=2
            min=3;
        }
        if (arr[2]>arr[4]) {// 5, 8, 2, 4, 3 min=2
            min=4;
        }
        if(rep != min){
            int temp=arr[min];
            arr[min]=arr[rep];
            arr[rep]=temp;
        }
    }
}
