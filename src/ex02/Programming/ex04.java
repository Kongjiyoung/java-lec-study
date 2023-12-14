package ex02.Programming;

public class ex04 {
    public static void main(String[] args) {
        System.out.println("P\t\t"+"Q\t\t"+"AND\t\t"+"OR\t\t"+"XOR\t\t");
        boolean p=true;
        boolean q=true;

        boolean and=(p&&q);
        boolean or=(p||q);
        boolean xor=(p!=q);

        System.out.print(p+"\t");
        System.out.print(q+"\t");
        System.out.print(and+"\t");
        System.out.print(or+"\t");
        System.out.println(xor);


        p=true;
        q=false;

        and=(p&&q);
        or=(p||q);
        xor=(p!=q);

        System.out.print(p+"\t");
        System.out.print(q+"\t");
        System.out.print(and+"\t");
        System.out.print(or+"\t");
        System.out.println(xor);


        p=false;
        q=true;

        and=(p&&q);
        or=(p||q);
        xor=(p!=q);

        System.out.print(p+"\t");
        System.out.print(q+"\t");
        System.out.print(and+"\t");
        System.out.print(or+"\t");
        System.out.println(xor);


        p=false;
        q=false;

        and=(p&&q);
        or=(p||q);
        xor=(p!=q);

        System.out.print(p+"\t");
        System.out.print(q+"\t");
        System.out.print(and+"\t");
        System.out.print(or+"\t");
        System.out.println(xor);




    }
}
