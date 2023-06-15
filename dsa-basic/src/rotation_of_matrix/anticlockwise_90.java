package rotation_of_matrix;

import java.util.Scanner;
class ant_rotation {
    public int[][] perform(int[][] arr, int r, int c)
    {
//        transpose of the matrix
        for(int i=0;i<r;i++)
        {
            for(int j=i; j<c;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
//        swapping the rows with each other
        for(int j=0;j<c;j++)
        { int ti=0;
            int bi=c-1;
            while(ti<bi)
            {
                int temp=arr[ti][j];
                arr[ti][j]=arr[bi][j];
                arr[bi][j]=temp;
                ti++;
                bi--;

            }

        }

        return arr;
    };

}


public class anticlockwise_90 {
    public static void main(String[]args)
    {        int m;
        int n;

        ant_rotation obj = new ant_rotation();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        m = scan.nextInt();
        System.out.println("Enter the number of columns:");
        n = scan.nextInt();
        int[][] array = new int[m][n];
        System.out.println("Enter the matrix :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scan.nextInt();

            }
        }
        int[][] result =   obj.perform(array,m,n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j]+" ");

            }
            System.out.println();

        }


    }

    }

