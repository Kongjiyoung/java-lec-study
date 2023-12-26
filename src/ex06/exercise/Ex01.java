package ex06.exercise;

class Student{
    private int number;
    protected String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class GrauateStudent extends Student{
    public String lab;

    public GrauateStudent(int number, String name, String lab) {
        super(number, name);
        this.lab = lab;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }
}

public class Ex01 {
    GrauateStudent gs=new GrauateStudent(010,"홍길동","lab");
    Student s = new GrauateStudent(011," d","lab");

}
