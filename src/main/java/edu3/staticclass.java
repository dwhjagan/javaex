package edu3;

class staticclass
{
    public static void copyArg(String str1, String str2)
    {
        //copies argument 2 to arg1
        str2 = str1;
        System.out.println("First String arg is: "+str1);
        System.out.println("Second String arg is: "+str2);
    }
    public static void main(String agrs[])
    {
        //StaticDemo.copyArg("XYZ", "ABC");
        copyArg("XYZ", "ABC");
    }
}