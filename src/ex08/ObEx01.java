package ex08;

class Account extends Object{
    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}

public class ObEx01 {
    public static void main(String[] args) {
        Account account = new Account("홍길동", 1111, 1000);
        Account account2 = new Account("홍길동", 1111, 1000);
        System.out.println(account);
        System.out.println(account.toString());
        System.out.println(account.hashCode());

        // 메모리 값 비교(), (주소 비교)
        if(account == account2){
            System.out.println("같아요?");
        }

        //account -> equals() (오브젝트) (주소비교)
        //account.toString -> equals() (주소비교 and 값비교)
        if("".equals(account2.toString())){
            System.out.println("같아요?");
        }

        String s1 = new String("물");
        String s2 = new String("물");

        System.out.println(s1.equals(s2));
    }

}
