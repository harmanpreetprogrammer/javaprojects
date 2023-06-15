class java
{
    int show(int x){
        System.out.println("In show in the class java");
        System.out.println(x);
        return x+9;
    };
//    void display(){
//        System.out.println("In display in the class java");
//    };
}

public class anonymous_object {
    public static void main(String[]args)
    {  int age=new java().show( 5);
        System.out.println(age);


    }
}
