package ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionEx01 {
    public static void main(String[] args) {
        String a[] = new String[] {"A", "B", "C", "D", "E"};
        List<String> list = Arrays.asList(a);

        //1. 전통적인 for구문
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //2. for-each 구문
        for(String s: list){
            System.out.println(s);
        }
        //3. 반복자 사용
        String s;
        Iterator e = list.iterator();
        while(e.hasNext()) //아직 방문하지 않는 원소가 있으면 true로 반환
        {
            s=(String)e.next();//다음원소 반환
            System.out.println(s);
        }
        //4. Stream 라이브러리 사용
        list.forEach((n)-> System.out.println(n));
    }
}
