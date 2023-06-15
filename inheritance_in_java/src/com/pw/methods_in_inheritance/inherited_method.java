package com.pw.methods_in_inheritance;
class Demo
{
        Demo(int x)
        {
            System.out.println("parent class");
        }
}
class Demo1 extends Demo
{
    Demo1()
    { super(2);
        System.out.println("CHILD class");
    }
}
public class inherited_method {
    public static void main(String[]args)
    {
//        Demo obj=new Demo(5);
        Demo1 obj1=new Demo1();
    }
    

}
