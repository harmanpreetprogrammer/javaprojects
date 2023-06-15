public class assignmentabcdefgh {
    public static void main(String[] args) {
//        int n=5;
//        int m=7;
//        for(int i=0;i<m;i++) {
//
//            for (int j = 0; j < n; j++) {
//                if(i==0 &&j>0&&j<(n-1)|| j==0 &&i>0 ||j==(n-1) &&i>0 ||i==(m-1)/2)
//                System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

        int n = 7;
        int m = 7;
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                if (i==0 &&j>0 ||j==0 &&i>0||i==(m-1)&&j<=(n-1)/2||i==(m-1)/2 &&j==(n-1)/2||j==(n-1)/2 &&i>(n-1)/2||j==(n-1) &&i>(n-1)/2 ||i==(m-1)/2 &&j>(n-1)/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}

