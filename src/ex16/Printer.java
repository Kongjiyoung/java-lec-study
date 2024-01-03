package ex16;

public class Printer { //동기화 메소드 사용예제
    synchronized void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    void print1(int[] arr) throws Exception{ //동기화블록 : 동기화 메소드와 달리 코드를 지정할 수 있다.
        synchronized (this) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
                Thread.sleep(100);

            }
        }
    }
}
