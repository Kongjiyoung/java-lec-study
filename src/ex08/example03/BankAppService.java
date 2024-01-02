package ex08.example03;

import ex08.example03.model.Account;

public class BankAppService {
    public void 계좌이체(Account senderAccount, Account receiverAccount, double amount) throws RuntimeException{
        if(amount<=0){
            throw new RuntimeException("입금할 금액 0원이하 입니다");
        }

        senderAccount.잔액부족하니(amount);

        senderAccount.출금(amount);
        receiverAccount.입금(amount);
    }

    public void 입금하기(Account Account, double amount) throws RuntimeException{
        if(amount<=0){
            throw new RuntimeException("입금할 금액 0원이하 입니다");
        }

        Account.입금(amount);

    }
    public void 출금하기(Account withdrawAccount, double amount) throws RuntimeException{
        if(amount<=0){
            throw new RuntimeException("입금할 금액 0원이하 입니다");
        }

        withdrawAccount.잔액부족하니(amount);

        withdrawAccount.출금(amount);

    }

}
