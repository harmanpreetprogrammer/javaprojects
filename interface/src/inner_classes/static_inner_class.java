package inner_classes;

class C
{
    void show()
    {
        System.out.println("in show in outer class");
    }
   static class D
    {
        void show()
        {
            System.out.println("in show in inner class");
        }

    }
}
public class static_inner_class {
    public static void main(String[]args)
    {
       C.D object= new C.D();
       object.show();

    }
}
