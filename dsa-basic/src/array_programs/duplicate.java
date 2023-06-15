package array_programs;

import java.util.Scanner;

public class duplicate {
    public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the String:");
            String str = scan.next();
            char[] array = str.toCharArray();
            int n= array.length;
            for(int i=0;i<n-1;i++)
            { for(int j=i+1;j<n;j++)
            {
                if(array[i]==array[j])
                {
                    System.out.print(array[i]+" ");
                }
            }

            }

        }
    }


