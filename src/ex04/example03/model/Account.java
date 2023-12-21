package ex04.example03.model;

public class Account {
    final private int id;
    private double balance;
    private int userId;

    public Account(int id, double balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }
    public void 계좌금액확인(double amount){
        if (balance-amount<0){
            System.out.println("계좌에 금액이 부족합니다");
            return;
        }
    }

    public void 출금(double amount){
        balance=balance-amount;
    }

    public void 입금(double amount){
        balance=balance+amount;
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
