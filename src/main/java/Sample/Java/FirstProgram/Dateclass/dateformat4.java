package Sample.Java.FirstProgram.Dateclass;

/**
 * Created by janaidu on 17/12/2016.
 */
import java.util.Date;
public class dateformat4 {

    public static void main(String args[]) {
        // Instantiate a Date object
        Date date = new Date();

        // display formatted date
        System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
    }
}