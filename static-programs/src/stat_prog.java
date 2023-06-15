import java.awt.*;

class Launch
{
    static int a;
    static int b;
    static {
        a=6;
        b=9;
        System.out.println(a+" "+b);
    }
    static {
        a=4;
        b=3;
        System.out.println(a+" "+b);
    }
    int x;
    int y;
    {
        x=9;
        y=7;
        System.out.println(x+" "+y);
        System.out.println("Instance1 block");
    }
    {
        x=92;
        y=73;
        System.out.println(x+" "+y);
        System.out.println("Instance2 block");
    }
   static void Display()
    {
        System.out.println("static method");
    }
   void Display1()
    {
        System.out.println(" Non static method");
    }
}

public class stat_prog {
    public static void main(String[]args)
    {
        Launch obj=new Launch();
        obj.Display1();
        obj.Display();
    }
}
