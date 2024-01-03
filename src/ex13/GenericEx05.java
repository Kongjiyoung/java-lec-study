package ex13;

class Model1 <T>{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class User1{
    public int  id = 1;
    public String name = "홍길동";
    public String email = "ssar@naver.com";

    public void hello(){
        System.out.println("안녕하세요");
    }
}

public class GenericEx05 {
    public static void main(String[] args) {
        Model1<User> m=new Model1();
        m.setData(new User());

        User u =m.getData();
        u.hello();
    }
}
