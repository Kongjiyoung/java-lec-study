package ex04.example03;

import ex04.example03.model.User;
import ex04.example03.model.Account;

public class BankApp {
    public static void main(String[] args) {
        //계좌이체 클래스 힙
        BankAppService 부산점=new BankAppService();

        //계좌객체 생성
        Account billAccount = new Account(1111,1000000L, 0001);
        Account jiyoungAccount = new Account(2222,1000L, 0002);

        //사용자객체 생성
        User bill = new User(0001,"Bill","01011111111");
        User jiyoung = new User(0002, "jiyoung", "01048563847");

        //이체받을 금액 입력
        double amount=10000L;

        //계좌이체
        부산점.계좌이체(billAccount, jiyoungAccount, amount);
        System.out.println(billAccount.toString());
        System.out.println(jiyoungAccount.toString());
    }
}
