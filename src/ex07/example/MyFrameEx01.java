package ex07.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;



public class MyFrameEx01 {

    static int num=1;

    public static void main(String[] args) {
        JFrame jf =new JFrame();
        //jf.setLayout(new BorderLayout());
        jf.setSize(300,500);


        JButton btn1= new JButton("더하기");
        JButton btn2= new JButton("빼기");
        JLabel la1 = new JLabel(num+"");

        jf.add("North", btn1);
        jf.add("South", btn2);
        jf.add("Center", la1);


        btn1.addActionListener(e -> { //람다에서는 타입을 쓰지않음 한글자일때는 ()괄호 생략가능
            num++;
            la1.setText(num+"");
        });
        btn2.addActionListener(e -> {
            num--;
            if (num<0){
                num=0;
            }
            la1.setText(num+"");
        });

        jf.setVisible(true);
    }
}
