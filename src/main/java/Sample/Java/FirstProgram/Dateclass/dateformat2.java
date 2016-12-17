package Sample.Java.FirstProgram.Dateclass;

/**
 * Created by janaidu on 17/12/2016.
 */

import java.util.Date;
public class dateformat2 {

    public static void main(String args[]) {
        // Instantiate a Date object
        Date date = new Date();

        // display time and date using toString()
        String str = String.format("Current Date/Time : %tc", date );

        System.out.printf(str);
    }
    //Current Date/Time : Sat Dec 17 23:39:48 GMT 2016
}