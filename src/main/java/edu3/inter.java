package edu3;

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