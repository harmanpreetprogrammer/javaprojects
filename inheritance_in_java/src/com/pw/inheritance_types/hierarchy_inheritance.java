package com.pw.inheritance_types;

class hry1

{
    void show()
    {
        System.out.println("The hry1 parent class in the package");
    }
}
class hry2 extends hry1
{

}
class hry3 extends hry1
{

}
public class hierarchy_inheritance {
    public static void main(String[]args)
    {
        hry2 object1 = new hry2();
        hry3 object2 = new hry3();
        object1.show();
        object2.show();

    }
}
