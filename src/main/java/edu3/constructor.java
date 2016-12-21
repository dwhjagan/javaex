package edu3;

//A constructor is a block of code used to initialize an object immediately
// after the object is created.
//The structure of a constructor looks similar to a method.
class constructor {// www  .jav  a 2  s.c  o  m

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

