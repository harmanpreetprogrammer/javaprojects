package arrays.max_min;

import java.util.Scanner;
// method 1:sorting,T.C=O(N logN)
//method2:T.C=O(n);
public class max_min_element_brute_force {
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

        int max=array[0];
        int min=array[0];
        for(int i=1;i<n;i++)
        {
            if(array[i]<min)
        {
            min=array[i];
        }
            if(array[i]>max)
            {
                max=array[i];
            }

        }
        System.out.println("Your maximum element is: "+max);
        System.out.println("Your minimum element is: "+min);
    }
}
