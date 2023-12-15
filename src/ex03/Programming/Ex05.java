package ex03.Programming;

public class Ex05 {
    public static void main(String[] args) {
        for (int i = 1; i <=6; i++) {
            for (int j = 1; j < 6; j++) {
                if(i+j==6){
                    System.out.print("("+i+","+j+") , ");
                }
            }
        }


        int j;
        for (int i=1; i<=6; i++){
            j=6-i;
            if(j!=0 && i+j==6) {
                System.out.print("(" + i + "," + j + ") , ");
            }

        }
    }
}
