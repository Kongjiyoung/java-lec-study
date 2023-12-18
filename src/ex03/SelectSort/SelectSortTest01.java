package ex03.SelectSort;

public class SelectSortTest01 {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 4, 3};
        final int N = arr.length;

        //  변경해야할 위치 5--> replace -> rep

        // 변경해야할 위치 8 --> min -> min

        final int rep=0;
        int min=rep;
        int i=rep;

        for (int j = 0; j < 4; j++) {
            i=i+1; //1
            if (arr[min]>arr[i]) {// 5, 8, 2, 4, 3
                min=i;
            }
        }
        i=i+1; //1
        if (arr[min]>arr[i]) {// 5, 8, 2, 4, 3
            min=i;
        }

        i=i+1; //2
        if (arr[min]>arr[i]) {// 5, 8, 2, 4, 3 min=2
            min=i;
        }

        i=i+1; //3
        if (arr[min]>arr[i]) {// 5, 8, 2, 4, 3 min=2
            min=i;
        }

        i=i+1; //4
        if (arr[min]>arr[i]) {// 5, 8, 2, 4, 3 min=2
            min=i;
        }
        if(rep != min){
            int temp=arr[min];
            arr[min]=arr[rep];
            arr[rep]=temp;
        }
    }
}
