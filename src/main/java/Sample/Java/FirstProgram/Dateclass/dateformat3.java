package Sample.Java.FirstProgram.Dateclass;

/**
 * Created by janaidu on 17/12/2016.
 */

import java.util.Date;
public class dateformat3 {

    public static void main(String args[]) {
        // Instantiate a Date object
        Date date = new Date();

        // display time and date using toString()
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
    }
}