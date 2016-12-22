package edu3;

interface A
{
    int x=10;
}
interface B
{
    int x=100;
}

class interface2 implements A,B
{
    public static void main(String args[])
    {
        // reference to x is ambiguous both variables are x
      //  System.out.println(x);
        System.out.println(A.x);
        System.out.println(B.x);
    }
}

/*

Benefits of having interfaces:

Following are the advantages of using interfaces:

Without bothering about the implementation part,
we can achieve the security of implementation
In java, multiple inheritance is not allowed,
However by using interfaces you can achieve the same .
A class can extend only one class but can implement any number of
interfaces. It saves you from Deadly Diamond of Death(DDD) problem.

 */