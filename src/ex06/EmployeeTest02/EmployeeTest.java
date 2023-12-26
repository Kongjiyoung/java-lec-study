package ex06.EmployeeTest02;

class Date extends Employee{
    private int year, month, date;

    public Date(String name, int year, int month, int date) {
        super(name);
        this.year = year;
        this.month = month;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", date=" + date +
                '}';
    }
}

class Employee{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee n1=new Employee("홍길동");
        Date d1=new Date(n1.getName(),1998,05,12);

        System.out.println(d1);
    }

}
