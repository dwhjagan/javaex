package edu4.com.constructor.com.construc;

public class privatecon {
    //Static Class Reference
    private static privatecon obj=null;

    private privatecon(){
      /*Private Constructor will prevent
       * the instantiation of this class directly*/
    }
    public static privatecon objectCreationMethod(){
	/*This logic will ensure that no more than
	 * one object can be created at a time */
        if(obj==null){
            obj= new privatecon();
        }
        return obj;
    }
    public void display(){
        System.out.println("Singleton class Example");
    }
    public static void main(String args[]){
        //Object cannot be created directly due to private constructor
        //This way it is forced to create object via our method where
        //we have logic for only one object creation
        privatecon myobject= privatecon.objectCreationMethod();
        myobject.display();
    }
}