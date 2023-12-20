package ex04;

import java.util.Scanner;

class SafeArray{
    private int a[];
    public int lenght;

    public SafeArray(int size){
        a=new int[size+1];
        lenght=size+1;
    }
    public int get(int index){
        if(lenght>index&&index>=0){
            return a[index];
        }
        else{
            return -1;
        }
    }
    public void put(int index, int value){
        if(lenght>index&&index>=0){
            a[index]=value;
        }else{
            System.out.println("잘못된 인덱스 : "+index);
        }
    }
    public void append(String item){
        Scanner sc=new Scanner(System.in);
    }
}
public class SafeArrayTest {
    public static void main(String[] args) {
        SafeArray arr=new SafeArray(3);
        for (int i = 0; i < arr.lenght; i++) {
            arr.put(i,i);
        }
    }
}