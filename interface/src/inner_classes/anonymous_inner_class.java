package inner_classes;
// anonymous inner class can be applied  while implementing the function of interface.
interface E
{
    void show();
    void display();

}
public class anonymous_inner_class {
    public static void main(String []args)
    {
        E object= new E()
        {
           public void show()
            {System.out.println("the show method");

            }
            public void display()
            {
                System.out.println("the display method");
            }
        };
        object.display();
        object.show();

    }
}
