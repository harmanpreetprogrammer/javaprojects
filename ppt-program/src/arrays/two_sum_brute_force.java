package arrays;

import java.util.Scanner;

public class two_sum_brute_force {
//    function definition
    public static int adding(int array[][],int m,int n,int target)
    {
        for(int i=0;i< array.length-1;i++)
        {
            for(int j=i+1;j<array[0].length;j++)
            {
                
            }
        }
        return 2;
    }
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number of rows: ");
       int m=  scan.nextInt();
       System.out.println("Enter the number of columns: ");
       int n=  scan.nextInt();
       int array[][]=new int[m][n];
       for(int i=0;i<array.length;i++)
       {
           for(int j=0;j<array[0].length;j++)
           {
               array[i][j]=scan.nextInt();
           }
       }

       System.out.println("Enter the targeted number: ");
     int target=  scan.nextInt();


//       function calling:
       int result= adding(array,m,n,target);
       System.out.println("The result is : "+result);
   }
}
