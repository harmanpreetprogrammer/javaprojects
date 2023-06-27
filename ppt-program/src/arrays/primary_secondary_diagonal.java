package arrays;

public class primary_secondary_diagonal {
    public static void main(String[]args)
   {
        int [][]arr={{3,2,1,4},{2,3,1,4},{1,5,1,1},{0,2,6,2}};
        int sum=0;
       int add=0;
       int n=arr[0].length-1;
        for(int i=0;i<arr.length;i++)
        { for(int j=0;j<=n;j++)
        {
            if(i==j)
                {
                    sum+=arr[i][j];
                    break;
            }
        }
        }

       for (int[] ints : arr) {
           add += ints[n--];
       }
       int res=0;
       int j=arr[0].length;
       if(arr[0].length % 2 !=0)
       {
        res=sum+add-arr[j/2][j/2];
       }
       else {
           res=sum+add;
       }
        System.out.println(res);
    }
}
