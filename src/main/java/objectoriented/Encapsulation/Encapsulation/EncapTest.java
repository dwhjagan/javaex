package objectoriented.Encapsulation.Encapsulation;

public class EncapTest {

    private String name;
    private String idNum;
    private int age;

    public int getAge() {                      // Method
        return age;
    }

    public String getName() {                  // Method
        return name;
    }

    public String getIdNum() {                 // Method
        return idNum;
    }

    public void setAge( int newAge) {           // Method
        age = newAge;
    }

    public void setName(String newName) {       //Method
        name = newName;
    }

    public void setIdNum( String newId) {       //Method
        idNum = newId;
    }

    //public class RunEncap {

        public static void main(String args[]) {   // MainMethod
            EncapTest encap = new EncapTest();
            encap.setName("James");
            encap.setAge(20);
            encap.setIdNum("12343ms");

            System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
        }
    }

    /*

    class -
    variable

     */