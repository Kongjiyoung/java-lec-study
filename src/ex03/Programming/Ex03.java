package ex03.Programming;

public class Ex03 {
    public static void main(String[] args) {
        for (int i = 1; i < 51; i++) {
            if(i%3==0){
                if(i>10) {
                    if((i-10)%3==3) {
                        System.out.print("짝  ");
                    }
                }else{
                    System.out.print("짝  ");
                }
            }else{
                System.out.print(i+" ");
            }
        }
    }
}
