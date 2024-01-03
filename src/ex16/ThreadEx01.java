package ex16;

public class ThreadEx01 {
    public static void sub1() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("start1 thread : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void sub2() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("start1 thread : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //main thread
    public static void main(String[] args) {//메서드는 스레드의 생명주기 메인스레드는 run만 호출  실은 메인스레드가 만듬
        Thread t1 = new Thread(()->{
            sub1(); //타겟은 런너블타입 /콜백 : 다른메서드에게 요청했는데 운영체제에서 주는거
        });
        t1.start();

        Thread t2 = new Thread(()->{
            sub2();
        });
        t2.start();


    }//main스레드 먼저종료
}
