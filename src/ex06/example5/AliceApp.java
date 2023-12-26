package ex06.example5;

abstract class 판사{//추상(abstract)클래스는 object가 아니다. 통로로 쓰임
    public abstract void 심문(); //통로로만 쓸거기때문에
}
abstract class 증인{
    public abstract void 대답(); //무조건 재정의할수 밖에없다 재정의를 강제시킨다
}
class 왕 extends 판사{ //왕을 띄울때 판사를 띄울 수 있음
    public void 심문(){
        System.out.println("왕은 심문한다");
    }
}

class 왕비 extends 판사{
    public void 심문(){
        System.out.println("왕비는 심문한다");
    }
}
class 모자장수 extends 증인{
    public void 대답(){
        System.out.println("모자장수는 대답한다");
    }
}
class 토끼 extends 증인{
    public void 대답(){
        System.out.println("토끼는 대답한다");
    }
}
class 앨리스 extends 증인{

    public void 대답() { //위에 추상메서드가 있기때문에 이름을 바꿀 수 없음 재정의를 강제시킨다
        System.out.println("앨리스는 대답한다");
    }
}

public class AliceApp {

    public static void main(String[] args) {

        //증인 s = new 증인(); 추상클래스는 new 만들 수 없음

        판사 u1 = new 왕비 (); //[판사, 왕비]
        증인 u2 = new 토끼();  //[증인, 토끼]

        u1.심문();
        u2.대답();
    }
}
