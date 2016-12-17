package Sample.Java.FirstProgram;

/**
 * Created by janaidu on 16/12/2016.
 */
public class Puppy1 {
    int puppyAge;

    public Puppy1(String name) {
        // This constructor has one parameter, name.
        System.out.println("Name chosen is :" + name );
    }

    public void setAge( int age ) {
        puppyAge = age;
    }

    public int getAge( ) {
        System.out.println("Puppy's age is :" + puppyAge );
        return puppyAge;
    }

    public static void main(String []args) {
      /* Object creation */
        Puppy1 myPuppy = new Puppy1( "tommy" );

      /* Call class method to set puppy's age */
        myPuppy.setAge( 2 );

      /* Call another class method to get puppy's age */
        myPuppy.getAge( );

      /* You can access instance variable as follows as well */
        System.out.println("Variable Value :" + myPuppy.puppyAge );
    }
}