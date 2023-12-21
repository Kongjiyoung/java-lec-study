package ex04.example.model;

public class User {
    final int id;
    String name;
    String email;

    public User(int id, String name, String email) { //유저클래스는 계좌클래스를 불러내기위한것이다
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
