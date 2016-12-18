package Sample.Java.FirstProgram.Methodclass;

/**
 * Created by janaidu on 18/12/2016.
 */

public class ExampleVoid {

    public static void main(String[] args) {
        methodRankPoints(9.7);
    }

    public static void methodRankPoints(double points) {
        if (points >= 202.5) {
            System.out.println("Rank:A1");
        }else if (points >= 122.4) {
            System.out.println("Rank:A2");
        }else {
            System.out.println("Rank:A3");
        }
    }
}