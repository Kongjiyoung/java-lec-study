package ex04;

public class DeskLampTest {
    public static void main(String[] args) {
        DeskLamp myLamp = new DeskLamp();

        myLamp.turnOn();
        System.out.println(myLamp); //myLamp.toString을 안붙여도 클래스만 호출하면 toString을 호출해줌 문법!

        myLamp.turnOff();
        System.out.println(myLamp);
    }
}
