package ex04;
class Box{
    int width;
    int length;
    int height;
    double getVoume(){
        return (double) width*height*length;
    }
}
public class BoxTest {
    public static void main(String[] args) {
        Box b;
        b= new Box();
        b.width=20;
        b.length=20;
        b.height=30;
        System.out.println("상자의 가로, 세로, 높이는 "+b.width+", "+b.height+", "+b.height+"입니다");
        System.out.println("상자의 부피는 "+b.getVoume()+"입니다.");
    }
}
