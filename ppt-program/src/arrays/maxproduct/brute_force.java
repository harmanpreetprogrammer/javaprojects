package arrays.maxproduct;

public class brute_force {
    public static void main(String[]args)
    {
        int arr[]={9,5,4,3,2,1};
        int n=arr.length-1;
        int array[]=new int[arr.length];
        for(int i=0;i<=n;i++)
        {
            array[n--]=arr[i];
        }
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i]);
        }
    }

}
