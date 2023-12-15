package ex03;

public class TheaterSeats {
    public static void main(String[] args) {

        int [][] seats = {
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 0}
        };

//        seats[0][7] = 1; //배열은 값은 변경가능하나 구조는 변경되지 않는다.
//        seats[0][7] = 0;

        int sum =0;
        int count=0;
//        int row=-1;
//        int [] seat1 = seats[0];//seats[0]행을 받아올 수 있다

//        System.out.println(seats.length);
//        System.out.println(seats[0].length);

        for (int row = 0; row < seats.length; row++) {
            count=0;
            for(int i=0; i< seats[row].length; i++){
                count = count+seats[row][i];
            }
            System.out.println(row+"번째 행의 관객수는 : "+ count);
            sum =sum+count;
        }
        System.out.println("전체 관객수는 : " + sum);
//        row++;
//        count=0;
//        for(int i=0; i< seats[row].length; i++){
//            count = count+seats[row][i];
//        }
//        System.out.println(row+"번째 행의 관객수는 : "+ count);
//        sum =sum+count;
//
//
//        row++;
//        count=0;
//        for(int i=0; i< seats[row].length; i++){
//            count = count+seats[row][i];
//        }
//        System.out.println(row+"번째 행의 관객수는 : "+ count);
//        sum =sum+count;
//
//
//        row++;
//        count=0;
//        for(int i=0; i< seats[row].length; i++){
//            count = count+seats[row][i];
//        }
//        System.out.println(row+"번째 행의 관객수는 : "+ count);
//        sum =sum+count;


//        System.out.println("전체 관객수는 : " + sum);
    }
}
