public class ilvxprinting {
    static public void main(String[] args)
    {
//        -------------------for priting IIIIII
//        int n=5;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                if(i==0 ||i==(n-1)||j==(n-1)/2)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        ----------------------for LLLLLL
//        int n=5;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                if(j==0||i==(n-1))
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        --------------------------FOR VVVVVVVVVVV
//        int n=21;
//        int m=11;
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                if(i==j && j<=(n-1)/2  || i+j==(n-1) && j>=(n-1)/2)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        -------------------------for xxxxxxxxxxxxxxx
//        -------always try to take odd values when u wish to broke it from half of it...
        int n=7;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j||i+j==(n-1))
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
