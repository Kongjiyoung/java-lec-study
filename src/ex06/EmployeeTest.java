package ex06;

class Person{
    String name;
    public Person(){}
    public Person(String theName){
        this.name=theName;
    }
}

class Employee extends Person{
    String id;
    public Employee(){
        super();
    }
    public Employee(String name){
        super(name);
    }
    public Employee(String name, String id){
        super(name);
        this.id=id;
    }

    public String toString(){
        return  "Emplyee [id="+id+"name="+name+"]";
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e =new Employee("Kim", "20210001");
        Employee e1 = new Employee("Kim");
        Employee e2 =new Employee();
        System.out.println(e);
        System.out.println(e1);
        System.out.println(e2);
    }
}
