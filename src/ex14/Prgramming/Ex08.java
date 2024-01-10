package ex14.Prgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex08 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Kim", "Park", "He", "I", "Lee", "Hello", "World");
        List<String> newList = list.stream().filter(s -> s.length()>=3).map(s->s.toUpperCase()).collect(Collectors.toList());
        newList.stream().forEach(e-> System.out.print(e+" "));
    }
}
