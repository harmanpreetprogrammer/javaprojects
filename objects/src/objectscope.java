 class demo
 {
     public  void print(){
         System.out.println();
     }

 }

public class objectscope {
    int b=9;

    public static void main(String[]args)
    {
        demo obj=new demo();
        obj.print();

    }
}
