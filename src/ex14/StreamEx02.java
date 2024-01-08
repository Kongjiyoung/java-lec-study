package ex14;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class User1 {
    private String name;
    private int age;

    public User1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void changeAge(){
        this.age=this.age-1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StreamEx02 {
    public static void main(String[] args) {
        // User 3명 만들기
        User1 u1=new User1("홍길동", 20);
        User1 u2=new User1("장보고", 15);
        User1 u3=new User1("임꺽정", 30);

        List<User1> user= Arrays.asList(u1, u2, u3);

//        List<User1> newUser=user.stream()
//                .map(u -> {u.setAge(u.getAge()-1);
//                return u;}).toList();
        List<User1> newUser=user.stream() //새로운 메서드를 만들어서 넣을 수 있다
                .map(u -> {u.changeAge();
                    return u;}).toList();
//        newUser.stream().forEach(u->{
//            System.out.println(user.getAge());
//        });
    }
}
