package preifx_sum;

import java.util.Scanner;

public class optimised_app {
    public static void main(String[] args) {

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
            }

        }


    }
}
