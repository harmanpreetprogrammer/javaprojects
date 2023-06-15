import java.util.Scanner;

class Testing
{

    static int x;
    static {
        Scanner scan=new Scanner(System.in);
        x=8;
        System.out.println("First Step: memory allocation of static variables and then the Second Step: execution of static intialisation block");
//        System.out.println("The value of x: "+x);
        System.out.println("Enter your age:");
        int age=scan.nextInt();
        System.out.println(age);

    }
    int m;
    int n;

    {
        m=80;
        n=90;
        System.out.println("When the object of class is created:memory allocation-instance variables and execution of intialisation block");
    }
  void display()
    {
//     System.out.println("Execution of non-static method called by the object created");
        System.out.println("The value of x is: "+x);
        System.out.println("The value of m is: "+m+" and n is: "+n);
    }
    static void dispaly1()
{
    System.out.println("the execution of staic method after calling in main method");

}

}
public class static_usage {
    public static void main(String[]args)
    {
     System.out.println("The third Step:execution of static method - main method call by jvm");
        Testing.dispaly1();
        Testing obj=new Testing();
        obj.display();


    }
}
