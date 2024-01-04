package ex13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map <String,String> map = new HashMap<String, String>();
        map.put("kim", "1234");
        map.put("park", "pass");
        map.put("lee", "word");
        //1. for-each구문과 keySet()을 사용하는 방법
        for(String key: map.keySet()){
            System.out.println("key="+key+", value="+map.get(key));
        }
        //1-1. String 타입을 var로 사용할 수 있다. (var은 모든 변수타입을 받는다)
        for(var key: map.keySet()){
            System.out.println("key="+key+", value="+map.get(key));
        }
        //2. 반복자를 사용하는 방법
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){//아직 방문하지 않는 원소가 있으면 true로 반환함
            String key = it.next();
            System.out.println("key="+key+", value="+map.get(key));
        }
        //3. Stream 라이브러리를 사용하는 방법, 람다식으로 교체
        map.forEach((key, value) -> {//각각의 원소를 들려 메소드를 출력한다
            System.out.println("key="+key+", value="+map.get(key));
        });

    }
}
