package arrays;

import java.util.Scanner;

public class number_pos_neg_zero {
    public static String checking(int n)  {
        String res=" ";
        if(n==0)
        {
            res="zero";
            return res;
        } else if (n>0) {
            res="positive";
            return res;

        }
        else {
            res="negative";
            return res;
        }

    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=scan.nextInt();
      String result=  checking(n);
      System.out.println("The number entered is "+result);
    }
}
