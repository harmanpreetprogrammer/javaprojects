package array_programs;

import java.util.Scanner;

public class missing_no {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of columns:");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an array except 1 :");

            for (int i = 0; i < n-1; i++) {
                array[i] = scan.nextInt();
            }

        int Nsum = ((n)*(n+1) / 2);
            int Asum=0;
            for(int i=0;i<n-1;i++)
            {
                Asum+=array[i];
            }
        int m_NO=Nsum-Asum;
            System.out.println("The missing number is: "+m_NO);
    }

}
