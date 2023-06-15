package com.pw.inheritance_types;


class Test1
{
    void display()
    {
        System.out.println("Running in Test1 class");
    }
}
class Test2 extends Test1
{

}
class Test3 extends Test2
{


}
class Test4 extends Test3
{

}
public class multilevel_inheritance {
    public static void main(String[]args)
    {
        Test4 obj=new Test4();
        obj.display();}
}
