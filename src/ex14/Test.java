package ex14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Kim","Park","Lee","Choi","Chee");

        List<String> sublist = list.stream() //스트림을 생성
                .filter(s->s.startsWith("C")) //필터로 C로 시작하는 문자열
                .sorted() // 문자열을 정렬
                .collect(Collectors.toList()); //결과를 모아서 리스트로 만든다.
        System.out.println(sublist);
    }
}
