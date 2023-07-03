package arrays;

import java.util.Scanner;

public class largest_three {
    public static int comparing(int num1,int num2,int num3)
    {
        if(num1>num2)
        {
            if (num1 <= num3)
                return num3;
            else
                return  num1;
        }
        else {
            if(num2>num3)
                return num2;
            else
                return num3;
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1= scan.nextInt();
        System.out.println("Enter the second number:");
        int num2= scan.nextInt();
        System.out.println("Enter the third number:");
        int num3= scan.nextInt();
        int res=comparing(num1,num2,num3);
        System.out.println("The largest number among them is: "+res);
    }
}
