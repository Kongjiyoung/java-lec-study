package ex13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTest02 {
    public static void main(String[] args) {
        Set<Integer> s1= new HashSet<>(Arrays.asList(1,2,3,4,5,7,9));
        Set<Integer> s2= new HashSet<>(Arrays.asList(2,4,6,8));

        s1.retainAll(s2);
        System.out.println(s1);
        s1.addAll(s2);

    }

}
