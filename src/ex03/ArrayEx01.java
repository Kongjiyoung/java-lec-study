package ex03;

public class ArrayEx01 {
    public static void main(String[] args) {
        int [] arr=new int[3];//주소 4+12 =16-1 //배열은 타입이 없으면 만들수 없다. 공간확보하기 위해서

        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        for (int i = 0; i <=2; i++) {
            System.out.println(arr[i]);
        }
    }
}
