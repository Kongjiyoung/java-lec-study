package ex04;

public class Box02 {
    int width, height, depth;
    void  Box2(int w, int h, int d){
        width=w;
        height=h;
        depth=d;
    }

    public static void main(String[] args) {
        Box02 b=new Box02();
        System.out.println("상자의 크기 : ("+b.width+","+b.height+","+b.depth+")");

    }
}
