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

        int six=6;
        int j;
        for (int i=1; i<=6; i++){
            j=six-i;
            if(j!=0) {
                System.out.print("(" + i + "," + (six - i) + ") , ");
            }

        }
    }
}
