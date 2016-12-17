package Sample.Java.FirstProgram.FirstProgram;

public class Puppy {

  public Puppy(String name) {                           // Method
    // This constructor has one parameter, name.
    System.out.println("Passed Name is :" + name );
  }

  public static void main(String []args) {               // Main method.
    // Following statement would create an object myPuppy
    Puppy myPuppy = new Puppy( "Jagan" );
  }
}
// main method calling another method.
