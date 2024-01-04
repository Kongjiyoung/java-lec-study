package ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytListEx01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        //위에 세줄과 13번째행과 같다
        List<Integer> arr2= Arrays.asList(1,2);
    }
}
