
class Test
{
    private int age;
    private String name;
    Test()
    {
        this(23);
        System.out.println("constructors in zero parameters");
        age=9;
        name="Rohan";

    }
    Test( int age)
    {  this.age=age;
        System.out.println("constructor having one parameters");
        name="RAHUL";
        show();
    }
    Test(int age,String name)
    {
        System.out.println("constructor having  two parameters");
     this.age=age;
      this.name=name;

    }
    public void show()
    {
     System.out.println("The age of the student is :"+age);
        System.out.println("The name of the student is :"+name);

    }
}


public class constructor_overloading {
    public static  void main(String[]args)
    {

        Test obj1= new Test();
        obj1.show();
//       Test obj2= new Test(23);
//        obj2.show();
        Test obj3= new Test(22,"Raman");
        obj3.show();




    }
}
