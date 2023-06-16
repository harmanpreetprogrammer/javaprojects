package preifx_sum;

import java.util.Scanner;
//for this matrix,the below is the solution
//        1 1 1 1 1
//        1 1 1 1 1
//        1 1 1 1 1
//        1 1 1 1 1
//        1 1 1 1 1
//r1,c1=2;       r2,c2=3
class sum
{
    Scanner scan= new Scanner(System.in);
    public int perform(int[][] arr, int m, int n)
    { int adt=0;
//        row wise sum
        for(int i=0; i<m;i++)
    {
        for(int j=1;j<n;j++)
        {
            arr[i][j]+=arr[i][j-1];
        }
    }
//        column wise sum
        for(int j=0;j<n;j++)
        {
              for(  int i=1; i<m;i++)
            {
                arr[i][j]+=arr[i-1][j];
            }
        }
      int result;
        result = computaion(arr);

        return result;
    }
    public int computaion(int[][] arr)
    {
        System.out.println("Enter the row1: ");
        int r1=scan.nextInt();
        System.out.println("Enter the column1: ");
        int c1=scan.nextInt();
        System.out.println("Enter the row2: ");
        int r2=scan.nextInt();
        System.out.println("Enter the column2: ");
        int c2=scan.nextInt();
        int whole_m=arr[r2+1][c2+1];
        int left_reg=arr[r2+1][c1-1];
        int up_reg=arr[r1-1][c2+1];
        int corner_rep=arr[r1-1][c1-1];
        int blin=arr[r2+1][c1-2];
        int right_line=arr[r2+1][c1-2];
       int rep_top=arr[r1-1][c1-2];
        int rep_bot=arr[r1][c1-2];
        int summation;
        summation = whole_m-up_reg-left_reg+corner_rep-right_line-blin+rep_top+rep_bot;
        return summation;
    }
}

public class sum_of_matrix_5 {

    public static void main(String[]args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m=scan.nextInt();
        System.out.println("Enter the number of columns: ");
        int n=scan.nextInt();
        int[][] array = new int[m][n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<m;i++)
        {
            for (int j=0; j<n; j++ )
            {
                array[i][j]= scan.nextInt();
            }
        }
        sum obj=new sum();
      int result = obj.perform(array,m,n);

       System.out.println("The result is "+result);

    }
}
