package Searching;

import java.util.Scanner;

public class linear_search {
public static void main(String[]args)
{
boolean flag=true;
    System.out.println(" Enter the number of elements :");
    Scanner scan =new Scanner(System.in);
    int n=scan.nextInt();
    int array[] =new int[n];
    for(int i=0;i< n;i++)
    {
        array[i]=scan.nextInt();
    }
    System.out.println(" Enter the element to be searched:");
    int x=scan.nextInt();
    int idx=-1;
    for(int i=0;i< n;i++)
    {
        if(array[i]==x)
        {
            idx=i;
            break;
        }

    }
    if(idx==-1)
    {
        System.out.println("The searched element is not found.");
    }
    else {
        System.out.println("The searched element is found at: "+idx+" index number in the array.");
    }



}
}
