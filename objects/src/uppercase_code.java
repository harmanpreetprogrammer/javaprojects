public class uppercase_code {
    public static void main(String[]args)
    {
        String str="Raman";
        char[] array2=new char[5];
        char[] array=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(array[i]>='a'&& array[i]<='z')
            {
                array[i]=(char )(array[i]-32);

            }
            System.out.print(array[i]);
        }

    }
}
