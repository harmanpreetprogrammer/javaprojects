package arrays;

import java.util.Scanner;

class Solution1 {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n-1;i++){
            j=i+1;
            if(nums[i]==0){
                while(nums[j]==0&&j<n-1){
                    j++;
                }
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }else{
                continue;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
public class brute_force_approach {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        Solution1 obj=new Solution1();
        System.out.println("Enter the number of elements: ");
        int n=scan.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]= scan.nextInt();
        }
        obj.moveZeroes(nums);
    }
}
