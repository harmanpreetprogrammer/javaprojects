public class print_duplicates {
    public static void main(String[]args)
    {
        String str="Khushi Kumari Gupta";
        String str1="";
        str=str.toLowerCase();
        char[] array1=str.toCharArray();
        int j;
        for(int i=0;i< array1.length;i++)
        {
            for(j=0;j<array1.length;j++)
            {
                if(array1[i]==array1[j])
                {
                  break;  // after we applied the break that loop will not execute the further conditions
                }

            }
            if(i!=j)
            {
                str1=str1+array1[i];
            }
        }
        System.out.print(str1);
    }
}
