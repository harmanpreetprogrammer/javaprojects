package arrays.buy_sell_stock;

import java.util.Scanner;

public class sell_buy_stock_bruteForce{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of columns: ");
        int m=scan.nextInt();
        int profit =0;
        int array[]= new int[m];
        int n= array.length;
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            array[i]= scan.nextInt();
        }
       for(int i=0;i<n-1;i++)
       {
         for(int j=i+1;j<n;j++)
         {
          profit= Math.max(profit,array[j]-array[i]) ;
         }
       }
       System.out.println("Your maximum profit is: "+profit);
    }
}
