package ex06.EmployeeTest;

class Employee{
    public int baseSalary=3000000;
    int getBaseSalary() {
        return baseSalary;
    }
}

class Manager extends Employee{
    int getSalary() {
        return (baseSalary+2000000);
    }
}

class Programmer extends Employee{
    int getSalary(){
        return (baseSalary+3000000);
    }
}
public class Test {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.println("관리자의 월급 : "+obj1.getSalary());

        Programmer obj2=new Programmer();
        System.out.println("프로그래머의 월급 : "+obj2.getSalary());
    }
}
