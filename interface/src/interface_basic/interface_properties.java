package interface_basic;
interface Learning
{
    public static final int x=9;
   default void show()
    { display();
        System.out.println("the default method in interface");
    };
    private static  void display()
    {
        System.out.println("private method in interface");
    };

}
class Science implements Learning
{


    public void show()
     {
         System.out.println("The show method has been executed.");
     }
    public void display()
     {
         System.out.println("The display method has been executed.");
     }
    public void Run()
    {
        System.out.println("The run method has been executed.");
    }

}
public class interface_properties {
    public static void main(String[]args)
    {
        Learning obj= new Science();
//        obj.display();
        obj.show();
//        obj.Run();


    }
}
