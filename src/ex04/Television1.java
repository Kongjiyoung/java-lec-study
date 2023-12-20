package ex04;

public class Television1 {
    int channel;
    int volume;
    boolean onoff=true;

    public static void main(String[] args) {
        Television1 myTv = new Television1();
        myTv.channel=7;
        myTv.volume=9;
        myTv.onoff=true;

        Television1 yourTv= new Television1();
        yourTv.channel=9;
        yourTv.volume=12;
        yourTv.onoff=true;

        System.out.println("나의 텔레비전의 채널은 "+myTv.channel+"이고 볼룸은 "+myTv.volume+"입니다.");
        System.out.println("너의 텔레비전의 채널은 "+yourTv.channel+"이고 볼룸은 "+yourTv.volume+"입니다.");
    }
}
