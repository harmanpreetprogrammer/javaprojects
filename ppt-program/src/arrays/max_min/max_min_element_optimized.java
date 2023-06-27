package arrays.max_min;

import java.util.Scanner;

public class max_min_element_optimized {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of columns: ");
        int m=scan.nextInt();
        int array[]= new int[m];
        int n= array.length;
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            array[i]= scan.nextInt();
        }
        int max=0;
        int min=0;
       if(n%2==0)
        {
        min=array[0];
         max=array[1];
        }
       else {

           min=array[0];
           max=array[0];
       }

        for(int i=2;i<n;i=i+2)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
            if(array[i]>max)
            {
                max=array[i];
            }
            if(array[i+1]<min)
            {
                min=array[i+1];
            }
            if(array[i+1]>max)
            {
                max=array[i+1];
            }

        }
        System.out.println("Your maximum element is: "+max);
        System.out.println("Your minimum element is: "+min);
    }
}
