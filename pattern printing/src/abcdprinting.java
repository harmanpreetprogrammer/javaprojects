public class abcdprinting {
    public static void main(String[]args)
    {
//        ---------------------------------------------for AAAAAAAAAAAAAAAAAAAAAAAAAA
//        int n=7;
//        int m=5;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<m;j++)
//            {
//                if(i==0&&j>0&&j<m ||j==0 &&i>0 &&i<=(n-1) || j==(m-1) &&i>0 &&i<=(n-1) ||i==(n-1)/2 )
//                    System.out.print("*");
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
////        -------------------------------------- FOR B
//        int n=7;
//        int m=4;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<m;j++)
//            {
//                    if(j==0 ||i==0 &&j<(m-1)||i==(n-1)&&j<(m-1) || i==(n-1)/2 &&j<(m-1) ||i>0&&i<(n-1)/2 && j==(m-1)||i>(n-1)/2 && i<(n-1)&&j==(m-1))
//                    System.out.print("*");
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
////        -------------------------------------- FOR CCCCCCCCCCCCCCCCCCCCCCCCCCCC
//        int n=9;
//        int m=7;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<m;j++)
//            {
//                if(i==0 &&j>0 ||i==(n-1) &&j>0||j==0 &&i>0&&i<(n-1))
//                    System.out.print("*");
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        //        -------------------------------------- FOR DDDDDDDDDDDDDDDDDDDDDDDDDDDDD
        int n=9;
        int m=7;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j==0 ||i==0 &&j<(m-2)||i==(n-1)&&j<(m-2)||i>0 &&i<(n-1) &&j==(m-1))
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
