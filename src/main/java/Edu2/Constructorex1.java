package Edu2;
public class Constructorex1 {
    private String firstName = null;     // Variable
    private String lastName = null;
    private int birthYear = 0;

    public Constructorex1(String first, String last, int year) {
    //    firstName = first;
    //    lastName = last;                 // constructor
    //    birthYear = year;
        this.firstName = first;
        this.lastName  = last;
        this.birthYear = year;
    }
    public static void main(String[] args) {

        Constructorex1 placeholder = new Constructorex1("Jack",
                "Daniels", 2000);
        System.out.println(placeholder.firstName+ "   "+ placeholder.lastName);

    }
}