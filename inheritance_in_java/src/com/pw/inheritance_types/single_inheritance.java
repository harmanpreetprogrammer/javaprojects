package com.pw.inheritance_types;


class Demo1     // parent class // base class //super class
{
    private int x=9;
    int y;
    void display()
    {
        System.out.println("Running display method");
    }
    Demo1()
    {
        System.out.println("Running Demo1 constructor");
    }

}
class Demo2 extends Demo1             // sub-class // derived class //child class
{                                                      // constructors and private members of parent class does not participate in inheritance
//    public Demo2()                                  // default zero parameterized constructor with super method

//    {
//        super();        // it calls the constructor of parent class
//    }

}



public class single_inheritance {
    public static void main(String[]args)
    {

        Demo2 obj=new Demo2();
        obj.display();
    }
}
