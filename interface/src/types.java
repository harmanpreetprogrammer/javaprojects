// functional interface
interface a
{
    void show();
}
class b implements a{
    @Override
    public void show() {
        System.out.println("in show");
    }
}
public class types {
    public static void main(String[]args)
    {
        a obj=new b();
        obj.show();

    }
}
