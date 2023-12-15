package ex03.Programming;

public class EX06 {
    public static void main(String[] args) {
        int j;
        for (int i = 0; i <=10; i++) {
            j=(100-3*i)/10;
            if((100==3*i+10*j)&&j>=0 && j<=10){
                System.out.println("("+i+","+j+")");
            }
        }
    }
}
