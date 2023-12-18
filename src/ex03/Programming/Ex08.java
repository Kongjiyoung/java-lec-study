package ex03.Programming;

public class Ex08 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < 100; j++) {
                for (int k = 1; k < 100; k++) {
                    if(i*i+j*j==k*k){
                        if(i+j+k==100) {
                            System.out.println(i + "  " + j + "  " + k);
                        }
                    }
                }
            }
        }
    }
}
