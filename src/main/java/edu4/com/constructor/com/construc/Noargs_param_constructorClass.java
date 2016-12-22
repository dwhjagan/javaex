package edu4.com.constructor.com.construc;

 class Noargs_param_constructorClass
{
    private int var;
    public Noargs_param_constructorClass()
    {
        //code for default one
        var = 10;
    }
    public Noargs_param_constructorClass(int num)
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
        Noargs_param_constructorClass obj2 = new Noargs_param_constructorClass(77);
        Noargs_param_constructorClass obj3 = new Noargs_param_constructorClass();
        System.out.println("var is: "+obj2.getValue());
        System.out.println("var is: "+obj3.getValue());
    }
}