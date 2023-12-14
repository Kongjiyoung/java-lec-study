package ex03;

import java.util.Scanner;

public class GugudanEx03 {
    public static void main(String[] args) {
        for (int x = 1; x <10; x++) {
            for (int y = 1; y < 10; y++) {
                System.out.print(y+"*"+x+"="+y*x);
                System.out.print("\t");
            }

            System.out.println();
        }



    }
}
