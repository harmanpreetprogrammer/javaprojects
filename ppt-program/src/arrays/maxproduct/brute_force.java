package arrays.maxproduct;
class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int res=0;
        int pr=1;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                pr=pr*nums[j];
                if(pr>res)
                {
                    res=pr;
                }
            }
        }
        return res;

    }
}
public class brute_force {
    public static void main(String[]args)
    {
        Solution obj=new Solution();
        int nums[]={2,3,-2,4};
      int result=  obj.maxProduct(nums);
      System.out.println(result);
    }
}
