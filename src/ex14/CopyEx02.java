package ex14;

import java.util.Arrays;
import java.util.List;




public class CopyEx02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
         //map
        List<Integer> newList = list.stream().map((i)->i*100).toList(); //객체를 가공해서 복사한다



        //for Each (for문대신에 쓸 수 있음)
        newList.stream().forEach(i -> System.out.println(i));
    }
}
