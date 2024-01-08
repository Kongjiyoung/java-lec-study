package ex14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamEx01 {
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("name","홍길동");//클래스를 안만들어도 변수를 만들 수 있다, 그러나 메서드를 만들 수 없다.
        data.put("age", 20); //map단점 1. 오타율이 높다 2.다운캐스팅해야한다(<Sring, Object>, Object값을 다른 곳에 넣기 위해서는 다운캐스트가 필요하다)
        //그치만 라이브러리를 만들때 어떤 자료타입을 만들지, 변수를 만들지 정하지 않아도 쉽게 추가 가능하다.

        Map<String, Object> data2 = new HashMap<>();
        data.put("name","장보고");
        data.put("age", 20);

        Map<String, Object> data3 = new HashMap<>();
        data.put("name","이순신");
        data.put("age", 20);

        List<Map<String, Object>> arr = Arrays.asList(data, data2, data3);
        List<Map<String, Object>> newArr =arr.stream().map(d ->{
            //d.get("age")=d.get("age")-1; //새로운 newAge변수를 만들어 다시 넣어야 한다.
            int newAge = (Integer) d.get("age")-1; // map타입이 object 타입이라서 다운캐스팅이 필요하다
            d.put("age", newAge);
            return d;
        }).toList(); //toList가 필요한 이유 map을 리스트값으로 바꾸기 위해서

        newArr.stream().forEach(d -> {
            System.out.println(d.get("age"));
        });
    }
}
