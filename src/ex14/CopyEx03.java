package ex14;

import java.util.Arrays;
import java.util.List;

public class CopyEx03 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        List<Integer> newList = list.stream().filter(i->i<3).toList(); //값을 필터한다.

        newList.stream().forEach(i -> System.out.println(i) );
    }
}