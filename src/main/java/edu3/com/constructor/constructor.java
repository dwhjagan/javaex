package edu3.com.constructor;

class constructor
{
    public int var;

     public void example2()
    {
        //code for default one
        var = 10;
    }
    public void example2(int num)
{
    //code for parameterized one
    var = num;
}
    public int getValue()
    {
        return var;
    }
    public static void main(String args[])
    {
        constructor obj2 = new constructor();
        obj2.example2(10);
        System.out.println("var is: "+obj2.getValue());
    }
}