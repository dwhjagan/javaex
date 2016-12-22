package edu4.com.constructor.com.interfaces;

//An interface defines a set of methods,
// without actually defining their implementation.
//A class can then implement the interface, providing actual
// definitions for the interface methods.
// usecase : we can't extend more than one class so we need
// interface to extend more than one class

interface Animal {
    public void eat();
    public void travel();
}


public class inter implements Animal {

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String args[]) {
        inter m = new inter();
        m.eat();
        m.travel();
    }
}