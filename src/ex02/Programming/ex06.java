package ex02.Programming;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("드라이브 이름: ");
        String drive=sc.next();

        System.out.print("디렉터리 이름: ");
        String dir=sc.next();

        System.out.print("파일 이름: ");
        String file=sc.next();

        System.out.print("확장자 이름: ");
        String ext=sc.next();

        System.out.println(drive+dir+file+"."+ext);
    }
}
