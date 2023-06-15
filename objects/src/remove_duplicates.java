public class remove_duplicates
{
    public static void main(String[]args)
    {
        String str="Raman Sharma";
        String str1="";
        String str2="";

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
             continue;
            }
            else
            {
              str1=str1+str.charAt(i);

            }
        }
     str1=str1.toLowerCase();
        char[] array=str1.toCharArray();
        int j;
        for(int i=0;i< array.length;i++)
        {
            for( j=0;j< array.length;j++)
            {
                if(array[i]==array[j])
                {break;

                }
            }
            if(i==j)
            {
             str2=str2+array[i];
            }
        }
        System.out.println(str2);

    }

}