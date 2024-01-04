package ex13;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("kim", "1234");
        map.put("park", "pass");
        map.put("lee", "word");

        System.out.println(map.get("lee"));//키를 기반으로 값을 찾는데 사용한다, 값으로 키를 찾지 못한다.


        for(String key: map.keySet()){ //키들의 집합을 반환한다.
            String value = map.get(key);
            System.out.println("key="+key+", value="+value);
        }
        map.remove(3);
        map.put("choi", "password");
        System.out.println(map);
    }

}
