package ex06.example4;

import ex06.example4.Dark;
import ex06.example4.Dragoon;
import ex06.example4.River;
import ex06.example4.Zealot;

public class StarApp {

    public static void gameStart(Protoss u1, Protoss u2){//Zealot z1=new Zealot으로 만들어도 여기서 Protoss를 가르키기 때문에 u1 zealot을 가르키다가 Protoss로 바뀐다
        u1.attack();
        u2.attack();
    }

    public static void main(String[] args) {
        Protoss z1 = new Zealot("z1"); //[Zealot, Protoss]
        Protoss d1 = new Dragoon("d1");//[Dragoon, Protoss]
        Protoss z2 = new Zealot("z2");//[Zealot, Protoss]


        gameStart(z1,d1);
        gameStart(d1,z1);
        gameStart(z2,z1);
        gameStart(z1,z2);

    }
}
