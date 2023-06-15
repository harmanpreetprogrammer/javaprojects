public class reverse_string {
    public static void main(String[]args)
    {
        String str=new String("PWSKILLS");
        String str1="";
        char[] array1=str.toCharArray();
        for(int i= array1.length-1;i>=0;i--)
        {
            str1=str1+array1[i];
        }
        System.out.println(str1);

    }
}
