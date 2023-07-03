package arrays;

import java.util.Scanner;

public class average_list {
    public static float average (int[] array,int n){
        float sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=array[i];
        }
        return sum/n;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=scan.nextInt();
        int []array=new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<n;i++)
        {
            array[i]= scan.nextInt();
        }
       float result= average(array,n);
        System.out.println("The average of given numbers is: "+result);
    }
}
