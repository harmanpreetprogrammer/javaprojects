import java.util.Scanner;

class Testing
{
    private int age;
    private String name;
    Testing()
    {
        Scanner data=new Scanner(System.in);
        System.out.println("What is your name?");
         name=data.nextLine();
        System.out.println("What is your age?");

        age=data.nextInt();

    }

    public void show()
    {
        System.out.println("The age of the student is :"+age);
        System.out.println("The name of the student is :"+name);

    }
}


public class user_input_constructor {

    public static  void main(String[]args)
    {

        Testing obj1= new Testing();
        obj1.show();





    }
}
