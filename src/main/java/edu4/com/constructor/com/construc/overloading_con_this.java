package edu4.com.constructor.com.construc;

public class overloading_con_this
{
    private int rollNum;

    overloading_con_this()
    {
        rollNum =100;
    }

    overloading_con_this(int rnum)
    {
        this();
      /*this() is used for calling the default
       * constructor from parameterized constructor.
       * It should always be the first statement
       * in constructor body.
       */
        rollNum = rollNum+ rnum;
    }

    public int getRollNum() {
        return rollNum;
    }
    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
}

class TestDemo{
    public static void main(String args[])
    {
        overloading_con_this obj = new overloading_con_this(12);
        System.out.println(obj.getRollNum());
    }
}