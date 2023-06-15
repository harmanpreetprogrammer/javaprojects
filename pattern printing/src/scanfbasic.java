import java.util.Scanner;

public class scanfbasic {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=scan.nextInt();
        System.out.println("Your age is "+ age);
        System.out.println("Enter your name:");
        String name=scan.next();
        System.out.println("Your name is "+name);
    }
}
