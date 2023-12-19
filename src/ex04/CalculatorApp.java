package ex04;

public class CalculatorApp { //app이 붙어있는 애한테 메인을 줌
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.add(50, 80); //실행되면 130으로 바뀜
        int result= cal.add(50,80);
        System.out.println("add : "+result);
        result=cal.minus(50,80);
        System.out.println("minua : "+result);
        result=cal.divide(50,80);
        System.out.println("divide : "+result);
        result=cal.multi(50,80);
        System.out.println("multi : "+result);

    }
}
