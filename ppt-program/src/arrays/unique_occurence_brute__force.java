package arrays;

import java.util.Scanner;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=true;
                    break;

                }
            }
        }
        return flag;

    }
}
public class unique_occurence_brute__force {
    public static void main(String[]args)
    {
        Solution obj=new Solution();
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int array[]=new int [n];
        for(int i=0;i<n;i++)
        {
            array[i]= scan.nextInt();
        }
       boolean flag= obj.uniqueOccurrences(array);
        System.out.println(flag);
    }
}
