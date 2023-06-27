package arrays.merge_sorted;

import java.util.Arrays;

public class optimized {

        //    function definiton
        public static int[] sorted_array(int[] num1, int[] num2, int m, int n, int k) {
            int m1=m-1;
            int n1=n-1;

            if(n>0)
            {
                for(int i=k;i>=0 && m1>=0;i--)
                {

                    if(num1[n1]>num2[m1])
                    {
                        num1[k--]=num1[n1--];
                    }
                    else if(num2[m1]>num1[n1])
                    {
                        num1[k--]=num2[m1--];
                    }
                }

            }

            return num1;
        }

        public static void main(String[]args)
        {
            int []num1={2,5,7,0,0,0};
            int []num2={3,10,17};
            int m=num2.length;
            int n=(num1.length/2);
            int k=m+n-1;
//        function calling
            int res[]= sorted_array(num1,num2,m,n,k);
            for(int i=0;i<res.length;i++)
            {
                System.out.print(res[i]+" ");
            }
        }
}
