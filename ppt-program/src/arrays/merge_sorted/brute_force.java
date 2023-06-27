package arrays.merge_sorted;

import java.util.Arrays;

public class brute_force {
//    function definiton
    public static int[] sorted(int num1[],int num2[],int m,int n,int k) {
        int j = 0;
        if (num1.length > 0) {
            for (int i = n ; i < k; i++) {

                if (j < m) {
                    num1[i] = num2[j];
                    j++;
                }
            }
        }

     Arrays.sort(num1);
            return num1;
        }

    public static void main(String[]args)
    {
        int []num1={2,5,7,0,0,0};
        int []num2={3,10,17};
        int m=num2.length;
        int n=num1.length/2;
        int k=m+n;
//        function calling
       int res[]= sorted(num1,num2,m,n,k);
       for(int i=0;i<res.length;i++)
       {
           System.out.print(res[i]+" ");
       }
    }
}
