public class startraingle {
    public static void main(String[]args)
    {
        int n=4;
        int m=3;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j==(m-1)/2||i==(n-1) )
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
