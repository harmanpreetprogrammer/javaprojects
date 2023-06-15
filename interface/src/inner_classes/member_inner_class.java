package inner_classes;
 class A
 {
     public void show()
     {
         System.out.println("in show in outer class");
     }
     class B
     {
         int x;
         public int show()
         {
             x=9;
             System.out.println("in show in inner class");
             return x;
         }
       static public int display()
         {
             System.out.println("in display in inner class");
             return 2;
         }


     }
 }
public class member_inner_class {
    public static void main(String[]args)
    {
        A object= new A();
        object.show();
       A.B ref= object.new B();
      int age= ref.show();
      System.out.println(age);
//       ref.display();
      int y=  A.B.display();
        System.out.println(y);
    }
}
