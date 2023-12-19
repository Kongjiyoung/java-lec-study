package ex03.test;

public class BinaryTest03 {
    public static void main(String[] args) {

        // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 9 / 2 = 4
        final int N=arr.length;
        final int Target = 2;

        int count=0;
        int start=0;
        int end =N-1;
        int mid =N/2;
        while(true) {
            count++;
            if (arr[mid] == Target) {
                System.out.println(Target+"은 "+mid+"번지에 있습니다");
                break;
            }
            if (arr[mid] < Target) {
                start = mid + 1;
            }
            if (arr[mid] > Target) {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        System.out.println(count);
        /*
        if(arr[mid]==Target){
            System.out.println("정답 찾음");
            break;
        }
        if(arr[mid]<Target){
            mid =mid-mid1;
        }
        if(arr[mid]>Target){
            mid =mid+mid1;
        }*/

    }
}
