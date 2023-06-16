package Searching;

import java.util.Scanner;
class search
{
    public int perform(int[] arr)
    {
        System.out.println("Enter the targeted value: ");
        Scanner scan=new Scanner(System.in);
        int value=scan.nextInt();
        int low=0;
        int high=arr.length-1;
      int mid=0;
      int result=-1;
      while(low<=high)
      {
          mid=low+(high-low)/2;

          if( arr[mid]== value)
          {
              result=mid;
             high=mid-1;
          }
         else if (arr[mid]<value)
        {
        low=mid+1;

         }
         else {
             high=mid-1;
          }
      }
      return result;
    }
}
public class lower_bound {
    public static void main(String[]args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of columns: ");
        int n=scan.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
            for (int j=0; j<n; j++ )
            {
                array[j]= scan.nextInt();
            }

        search obj=new search();
      int res=  obj.perform(array);

      if(res== -1)
      {
          System.out.println("The searched element is not found.");
      }
      else {
          System.out.println("The searched element is found at: "+res);
      }
    }
}
