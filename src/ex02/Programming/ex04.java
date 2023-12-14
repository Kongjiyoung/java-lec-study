package ex02.Programming;

public class ex04 {
    public static void main(String[] args) {
        System.out.println("P\t"+"Q\t"+"AND\t"+"OR\t"+"XOR\t");
        boolean p=true;
        boolean q=true;

        boolean and=(p&&q);
        boolean or=(p||q);
        boolean xor=(p!=q);

        System.out.print(p+"\t");
        System.out.print(q+"\t");
        System.out.println(and);
        System.out.println(or);
        System.out.println(xor);


    }
}
