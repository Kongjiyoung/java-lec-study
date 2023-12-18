package ex04;

//설계도
public class Circle {
    private int radius;

    //생성자 : 생성될 때 무조건 실행되는 메서드
    /*public Circle(){//태어날때무조건 가지고 태어나야하는 요소들 //ststic에 안뜬요소들이 뜬다
        radius=50; //태초값 세팅 // 초기화코드
    }*/
    public Circle(int r){//태어날때무조건 가지고 태어나야하는 요소들 //ststic에 안뜬요소들이 뜬다
        radius =r; //원하는 R을 만들어낼 수 있음
    }

    public double getArea(){
        return 3.14*radius*radius;
    }
}

