package preifx_sum;
import java.util.Scanner;
public class brute_force {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = scan.nextInt();
        System.out.println("Enter the number of columns:");
        int c = scan.nextInt();
        int[][] array = new int[r][c];
        System.out.println("Enter the elements of an array :");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = scan.nextInt();
            };
        };

        System.out.println("Enter the r1:");
        int r1 = scan.nextInt();
        System.out.println("Enter the c1:");
        int c1 = scan.nextInt();
        System.out.println("Enter the r2:");
        int r2 = scan.nextInt();
        System.out.println("Enter the c2:");
        int c2 = scan.nextInt();
        int sum=0;

        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
               sum=sum+array[i][j];
            };
        };

        System.out.println("The total sum of the entered matrix is :"+sum);

    }
}
