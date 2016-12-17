package Sample.Java.FirstProgram.variable;

/**
 * Created by janaidu on 17/12/2016.
 */

public class Test {

    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = (a == 1) ? 90: 78;
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );
    }
}