package ex04.example03;

import ex04.example03.model.Account;

public class BankAppService {
    public void 계좌이체(Account senderAccount, Account receiverAccount, double amount){
        if(amount<=0){
            System.out.println("입금할 금액 0원이하 입니다");
            return;
        }

        senderAccount.계좌금액확인(amount);

        senderAccount.출금(amount);
        receiverAccount.입금(amount);
    }

    public void 입금하기(Account Account, double amount){
        if(amount<=0){
            System.out.println("입금할 금액 0원이하 입니다");
            return;
        }

        Account.입금(amount);

    }
    public void 출금하기(Account withdrawAccount, double amount){
        if(amount<=0){
            System.out.println("입금할 금액 0원이하 입니다");
            return;
        }

        withdrawAccount.계좌금액확인(amount);

        withdrawAccount.출금(amount);

    }
}
