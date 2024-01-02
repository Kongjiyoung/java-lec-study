package ex08.example03.model;

//객체의 상태를 변경, 객체의 상태를 확인
public class Account {
    private final int id;
    private double balance;
    private int userId;

    public boolean 잔액부족하니(double amount) throws RuntimeException{ //잔액충분하니가 기본 코드
        if(balance<amount){
            throw new RuntimeException("출금할 금액이 계좌잔액보다 많습니다");
        }
        return false;
    }

    //메서드는 하나의 책임만 가진다.
    public void 출금(double amount){
        this.balance=this.balance-amount;
    }

    public void 입금(double amount){
        this.balance=this.balance+amount;
    }

    //

    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }


}
