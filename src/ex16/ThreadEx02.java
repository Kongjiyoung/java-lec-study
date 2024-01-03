package ex16;

class MyFile{
    public void write(){
        try {
            Thread.sleep(5000);
            System.out.println("파일쓰기완료");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class 화가 {
    public void 그림그리기(){
        System.out.println("그림그리기완료");
    }
}

public class ThreadEx02 {
    public static void main(String[] args) { //ux, I/O 에서 효과적임
        //타겟은 새로운 실의 길이
        new Thread(()->{
            MyFile mf = new MyFile();
            mf.write();
        }).start();

        화가 h = new 화가();
        h.그림그리기();
    }
}
