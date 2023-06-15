package array_programs;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args)
    { boolean flag=true;
        System.out.println(" Enter the name :");
        Scanner scan =new Scanner(System.in);
        String name=scan.next();
        char array[] =name.toCharArray();
        int n= array.length;
        for(int i=0;i< n;i++)
        {
            if(array[i] !=array[n-i-1])
            {
                flag=false;
                 break;
            }

        }
        if(flag== false)
        {
            System.out.println(" Not a palindrome");
        }
        else {
            System.out.println("A pailndrome");
        }
    }
}
