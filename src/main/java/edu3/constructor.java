package edu3;

//A constructor is a block of code used to initialize an object immediately
// after the object is created.
//The structure of a constructor looks similar to a method.

class constructor {

    // Constructor #1
    public constructor() {
        System.out.println("A car  is created.");
    }

    // Constructor #2
    public constructor(String name) {
        System.out.println("A car  named " + name + "  is created.");
    }

    public static void main(String[] args) {
        constructor d1 = new constructor(); // Uses Constructor #1
        constructor d2 = new constructor("My Car"); // Uses Constructor #2
    }
}


/*

A constructor initializes an object when it is created.
It has the same name as its class and is syntactically similar
to a method. However, constructors have no explicit return type.

Typically, you will use a constructor to give initial values to
the instance variables defined by the class, or to perform any other
startup procedures required to create a fully formed object.

All classes have constructors, whether you define one or not, because
Java automatically provides a default constructor that initializes all
member variables to zero. However, once you define your own constructor,
 the default constructor is no longer used.

*/


