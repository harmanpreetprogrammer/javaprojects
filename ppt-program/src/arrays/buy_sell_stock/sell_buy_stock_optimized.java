package arrays.buy_sell_stock;

import java.util.Scanner;

public class sell_buy_stock_optimized {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of columns: ");
        int m=scan.nextInt();
        int max =0;
        int min=Integer.MAX_VALUE;
        int array[]= new int[m];
        int n= array.length;
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            array[i]= scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
            if(array[i]-min >max)
            {
                max=array[i]-min;
            }
        }
        System.out.println("Your maximum profit is: "+max);
    }
}
