package ex04;

//설계도
class People{
    String name;
    int power;
    int hp;

    public People(String name, int power) {// this 를 붙여주는 이유 scope가 다르기 떄문에 구별해주기위해서이다. heap에있는 name과 스택에 있는 name이 다르기 떄문에
        this.name = name; //값을 받아서 객체의 상태로 옮기는 것이다
        this.power = power;
        this.hp = 100;
    }//객체 초기화는 생성자

    //행위
    public void upgradePower(){
        this.power++;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", hp=" + hp +
                '}';
    } //alt+insert toString()
}
public class PersonEx01 {
    public static void main(String[] args) {
        People p1=new People("티모", 10); //레퍼런스 변수로 찾는다
        System.out.println(p1);

        p1.upgradePower();
        System.out.println(p1);
    }
}
