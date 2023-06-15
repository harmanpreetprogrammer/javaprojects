package com.pw.inheritance_types;
class hbd1
{
    void show()
    {
        System.out.println("The hbd1 class is running");
    }

}
class hbd2 extends hbd1
//    single level : one child class
{

}
class hbd3 extends hbd2
{
//    multilevel : child of child class

}
class hbd4 extends hbd1
//    hierarchical : two child of hbd1 class
{

}
public class hybrid_inheritance {
    public static void main(String[]args)
    {  hbd1 object1 =new hbd1();
        hbd2 object2 =new hbd2();
        hbd3 object3 =new hbd3();
        hbd4 object4 =new hbd4();
        object1.show(); // parent class
        object2.show(); // child of hbd1 :single-level
        object3.show(); // child of hbd2 :multi-level
        object4.show(); // child of hbd1 : hierarchical



    }

}
