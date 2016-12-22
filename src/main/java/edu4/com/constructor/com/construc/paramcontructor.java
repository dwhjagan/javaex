package edu4.com.constructor.com.construc;

class paramcontructor
{
    public int var;

    public paramcontructor(int num)
    {
        var=num;
    }

    public int getValue()
    {
        return var;
    }
    public static void main(String args[])
    {
        paramcontructor myobj = new paramcontructor(10);
        System.out.println("value of var is: "+myobj.getValue());
    }
}