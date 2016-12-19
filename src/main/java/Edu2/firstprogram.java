package Edu2;

/**
 * Created by janaidu on 19/12/2016.
 */


public class firstprogram {

    public static void main(String []args) {

        int a;        // int
        a = 20;
        double b;     //double
        b = 4.5;
        float c;      //float
        c = 4;
        char jack = 'J'; //char
        String sentence = "This is my first program";

        boolean naidu = true;

        int a11, b11, c11;         // Declares three ints, a, b, and c.
        int a1 = 10, b1 = 10, c1 = 33; // Example of initialization
        byte B1 = 22;         // initializes a byte type variable B.
        double pi = 3.14159; // declares and assigns a value of PI.
        char a111 = 'a';        // the char variable a iis initialized with value 'a'


        float myFloat1 = 199;
        float myFloat2 = myFloat1;   // right hand side value in assignment
        float myFloat3 = myFloat2 + 123;  // as part of arithmetic expression


        System.out.println(myFloat3);        // as parameter in method call.

        System.out.println("This is my first program "+ a + "  " + b +"  "+ c +" "+ jack
                + "  "+ sentence+ "   "+ naidu);


        System.out.println(a1+"  "+b1+"  "+c1+" "+B1+" "+pi+"  "+a111);

        System.out.println(myFloat3);
    }
}