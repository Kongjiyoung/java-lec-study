package ex07.example;

interface Remocon {
    void on();

    void off();
}

class SamsungRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("삼성 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모컨 off");
    }
}

class LgRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("엘지 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("엘지 리모컨 off");
    }
}

/**
 * 작성자 : 홍길동
 * 날짜 : 2023.12.26
 * 구현체 : SamsungRemocon, LgRemocon
 *
 */
class CommonRemocon{ //has의 관계 -> (컴포지션관계 결합하는관계)
    //[Remocon <-, SamsungRemocon] Remocon을 가르키고 있다
    //[Remocon <-, LgRemocon]
    private Remocon r;

    public CommonRemocon(Remocon r) {
        this.r = r;
    }
    public void on(){
        r.on();
    }

    public void off(){
        r.off();
    }
}



public class InterEx01 {

    public static void main(String[] args) {
        //CommonRemocon cr=new CommonRemocon(new Remocon()); //이코드를 보아 Remocon은 인터페이스인지 알 수 있더
        CommonRemocon cr = new CommonRemocon(new SamsungRemocon()); //동적바인딩 내가 new하는 거에 따라 뜨는 클래스가 다르다.
        cr.on();
    }
}