package ex01;

public class VarEx01 {//모든코드는 클래스 내부에 적는다 자바 클래스명은 동일해야한다.,
//모든 코드는 main 메서드 내부에 적는다.
    public static void main(String[] args){
        int n1=1; //21억까지 (4Byte) 변수자리에 지정은 OS가 해준다
        double d1=1.5; //21억까지  (8Byte)
        long big1 = 2000000000000L; //경까지 (8Byte)
        boolean b1 = true; //true=1, false=0
        char c1= '가';
        int n2; //null이 들어감
        //메모리공간 확보
        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
    }//자바 프로그램 종료 메인이 자바의 생명주기
}
