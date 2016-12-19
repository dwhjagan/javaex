package Edu2;
/**
 * Created by janaidu on 19/12/2016.
 */

public class Pupage {
    public void pupAgeMethod() {                     // Method
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]) {         // Main Method
        Pupage test = new Pupage();
        test.pupAgeMethod();
    }
}