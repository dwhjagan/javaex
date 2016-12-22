package edu4.com.constructor.com.construc;

/**
 * Created by janaidu on 22/12/2016.
 */

class chaincontructor
{
    String s1, s2;
    public chaincontructor()
    {
        s1 ="Super class";
        s2 ="Parent class";
    }
    public chaincontructor(String str)
    {
        s1= str;
        s2= str;
    }
}

class Boy extends chaincontructor
{
    public Boy()
    {
        s2 ="Child class";
    }
    public void disp()
    {
        System.out.println("String 1 is: "+s1);
        System.out.println("String 2 is: "+s2);
    }
    public static void main(String args[])
    {
        Boy obj = new Boy();
        obj.disp();
    }
}