package interface_basic;
interface Computer
{
    abstract void compileocde();

}
class Laptop implements Computer
{
    public  void compileocde()
    {
        System.out.println("The code is compiling at the laptop.");
    }
}
class Desktop implements Computer
{
    public  void compileocde()
    {
        System.out.println("The code is compiling at the desktop.");
    }
}
class Developer
{

    public void build_app( Computer object)
{
    System.out.println("The app has been built.");
   object.compileocde();
}
}
public class basic {
    public static void main(String[]args)
    {
        Developer obj= new Developer();
        Laptop lap=new Laptop();
        Desktop desk=new Desktop();
        obj.build_app(lap);
        obj.build_app(desk);

    }
}
