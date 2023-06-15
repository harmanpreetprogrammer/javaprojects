package lambda_expression;
interface G
{
    int show(int x);
}
public class use_lambda_operator {
    public static void main(String[]args)
    {
//        G object=()-> System.out.println("show method");
        G object=(x)-> {System.out.println("show method");
            System.out.println(x);
            return x+8;
        };
       int age= object.show(6);
        System.out.println(age);
    }
}
