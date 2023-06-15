package rotation_of_matrix;

import java.util.Scanner;
class rotation {

    public int[][] perform( int arr[][] ,int r,int c) {
//        step 1 :transpose of  matrix
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
//        step2: swap of columns
        for(int i=0;i<r;i++)
        { int li=0;
            int ri= c-1;
            while (li<ri)
            {
                int temp= arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }

        }
        return arr;
    }


}

    public class clockwise_90 {
        public static void main(String[] args) {
            int m;
            int n;

            rotation obj = new rotation();
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of rows :");
            m = scan.nextInt();
            System.out.println("Enter the number of columns:");
            n = scan.nextInt();
            int array[][] = new int[m][n];
            System.out.println("Enter the matrix :");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = scan.nextInt();

                }
            }
         int result[][]=   obj.perform(array,m,n);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                   System.out.print(result[i][j]+" ");

                }
                System.out.println();

            }


        }
    }


