package ex13;

import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {

        Vector<String> vec = new Vector<>();
        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        //크기
        System.out.println(vec.size());

        //인덱스 접근
        System.out.println(vec.get(1));

        //정렬
        Collections.sort(vec);

        for(String s : vec){
            System.out.print(s+" ");
        }
        System.out.println();
        //정렬 (내림차순)
        Collections.sort(vec, Collections.reverseOrder());

        for(String s : vec){
            System.out.print(s+" ");
        }
        System.out.println();
        //정렬 다른방법
        //Arrays.sort(); 배열 정렬

        //삭제
        String result = vec.remove(2); //보통 번호를 삭제함
        System.out.println(result);
        //삭제되는지 사이즈로 확인하기
        System.out.println(vec.size());

        //값 찾기
        boolean search = vec.contains("Mango");
        System.out.println(search);


    }
}
