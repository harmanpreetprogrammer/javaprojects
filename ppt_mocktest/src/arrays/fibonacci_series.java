package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class fibonacci_series {
    public static int[] printFibo(int n) {
        int[] array =new int[n];

        for(int i=0;i<n;i++) {
            if (i == 0 || i == 1) {
array[i]=i;
            }
            else {
                array[i]=array[i-1]+array[i-2];
            }
        }
        return array;


    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=scan.nextInt();
        int[] res =printFibo(n);
        System.out.println("The fibocanni series is: "+ Arrays.toString(res));


    }
}
