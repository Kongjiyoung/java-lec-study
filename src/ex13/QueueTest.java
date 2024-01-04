package ex13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            q.add(i);
        }

        System.out.println("큐의 요소: "+q);

        int e =q.remove(); //큐는 무조건 FIFO로 첫번째요소 먼저 삭제해야 한다
        System.out.println("삭제된 요소: "+e);
        System.out.println(q);
    }
}
