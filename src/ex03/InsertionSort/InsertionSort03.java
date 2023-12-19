package ex03.InsertionSort;

public class InsertionSort03 {
    public static void main(String[] args) {
        /**
         * 1. 1회전(1바퀴)
         *
         * 1회전때 두번째위치를 첫번째 위치와 비교하여 작으면 바꿔야함
         *
         * 5, 8, 2, 4, 3
         *
         * (1) 8, 5 비교 (5, 8, 2, 4, 3)
         */
        int [] sort= {5, 8, 2, 4, 3};

        for (int i = 1; i < 5; i++) {
            int s=sort[i];
            for (int j = 0; j <i; j++) {
                if(s<sort[j]){
                    sort[j+1]=sort[j];
                }
                else{
                    sort[j+1]=s;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(sort[i]);
        }
    }
}
