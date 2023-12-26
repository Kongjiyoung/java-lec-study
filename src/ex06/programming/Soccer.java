package ex06.programming;

class Sports{
    String getName(){
        return "아직 결정되지 않음";
    }
    int getPlayers(){
        return 0;
    }
}

public class Soccer {
    String getName(){
        return "축구";
    }
    int getPlayers(){
        return 11;
    }

    public static void main(String[] args) {
        Soccer s1=new Soccer();
        System.out.println("경기이름 : "+s1.getName());
        System.out.println("경기자수 : "+s1.getPlayers());
    }
}
