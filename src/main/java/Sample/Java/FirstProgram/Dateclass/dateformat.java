package Sample.Java.FirstProgram.Dateclass;

/**
 * Created by janaidu on 17/12/2016.
 */

import java.util.*;
        import java.text.*;

public class dateformat {

    public static void main(String args[]) {
        Date dNow = new Date( );
        SimpleDateFormat ft =
                new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current Date: " + ft.format(dNow));
    }
}
// Current Date: Sat 2016.12.17 at 11:34:23 PM GMT