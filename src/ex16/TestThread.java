package ex16;

class MyRunnable1 implements Runnable{
    String myName;

    public MyRunnable1(String myName) {
        this.myName = myName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable1("A"));
        Thread t2 = new Thread(new MyRunnable1("B"));
        t1.start();
        t2.start();
    }
}
