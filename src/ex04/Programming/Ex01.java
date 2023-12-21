package ex04.Programming;

class Rocket{
    int x,y;

    public Rocket(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void moveUp(){
        this.y++;
    }
}
public class Ex01 {
    public static void main(String[] args) {
        Rocket r1=new Rocket(5, 5);

    }
}
