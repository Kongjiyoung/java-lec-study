package ex13;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        list.add(1, "APPLE");
        list.add(2, "GRAPE");
        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" ");
        }
    }
}