package ex07.example;

//라이브러리 판매 //구현체가 없을 때 만드는 방법
interface EventListener{ //Listener는 이벤트를 감지하는 아이 //데몬(계속 돌아야 함) //딜레이를 줘야함, 컴퓨터에 많은 자원을 쓰게 됨
    void action();
}

//라이브러리 판매자가 생성
class MyApp{
    public void click(EventListener l){
        l.action();
    }
}


public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.click(()->{
            System.out.println("회원가입 로직이 실행합니다");
        }); //람다표현식 메서드 앞에 이름이랑 다 없애고 표현한거 (메서드만 옮기는 기법)
    }
}
