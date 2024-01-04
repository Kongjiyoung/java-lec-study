package ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        //정해진 인덱스에 데이터 넣기
        list.add(1, "APPLE");
        list.add(2, "GRAPE");
        //인덱스 위치의 데이터 삭제
        list.remove(3);
        //인덱스에 저장딘 원소 반환
        String s = list.get(1);
        //어떤값이 리스트에 포함되어있는지 검사
        if(list.contains("APPLE")){
            System.out.println("APPLE이 리스트에서 발견되었습니다.");
        }
        //배열을 리스트로 변경하기
        //List<String> list = Arrays.asList(new String[size]);
    }


}
