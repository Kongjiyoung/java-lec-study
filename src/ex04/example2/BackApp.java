package ex04.example2;

import ex04.example2.model.Account;
import ex04.example2.model.User;

public class BackApp {
    public static void main(String[] args) {
        //1. 고객2명만들기
        User u1=new User(1, "ssar", "ssar@nate.com");
        User u2=new User(2, "cos", "cos@nate.com");
        //2. 계좌 2개만들기
        Account ssarAccount=new Account(1111, 1000L, 1);
        Account cosAccount=new Account(2222, 1000L, 2);
        Account loveAccount=new Account(3333, 1000L, 2);
        //3. 고객에게 정보를 받기(sender, receiver, amount)
        long amount=100L;

        //4. 이체(ssar -> cos 100원)
        BankSrvice.이체(ssarAccount,cosAccount,amount);

        //5. 이체 (ssar -> love 100원)
        BankSrvice.이체(cosAccount, loveAccount,amount);

        //6. 이체(cos->love 100원)
        BankSrvice.이체(cosAccount,loveAccount, amount);

        //7.객체 상태확인
        System.out.println(ssarAccount);
        System.out.println(cosAccount);
        System.out.println(loveAccount);

        //8. 출금
        BankSrvice.출금(ssarAccount, amount);

    }
}
