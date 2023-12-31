package ex06.example13;

class Protoss{

}

class Zealot extends Protoss{
    public void attack(){
        System.out.println("질럿이 공격합니다");
    }
}

class Dragoon extends Protoss{
    public void attack(){
        System.out.println("드라군이 공격합니다");
    }
}

public class CastingEx01 {

    public static void start(Protoss p){ //오버라이드보다는 코딩이 복잡해진다.
        //Zealot z = p; //부모를 자식에게 대입할 수 없다.
        if (p instanceof Zealot){ //타입검사하는거
            Zealot u =(Zealot) p; //다운캐스팅한다
            u.attack();
        }

        if (p instanceof Dragoon){
            Dragoon u =(Dragoon) p;
            u.attack();
        }

    }

    public static void main(String[] args) {

        start(new Zealot()); //
        start(new Dragoon());

    }
}
