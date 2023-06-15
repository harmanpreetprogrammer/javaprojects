
class DEmo
{
    static int age;
   static{
        age=6;
        System.out.println("Age"+ age);
    }
    public static void main(String[]args)
    {

        System.out.println("The main1 function");
        static_program OBJ=new static_program();

        OBJ.main();
    }

}
public class static_program {
    static{

        System.out.println("Age");
    }
     static void main()
    {

        System.out.println("The main function");


    }
    static void main( int x)
    {

        System.out.println("The main function");


    }


}
