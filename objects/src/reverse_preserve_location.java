public class reverse_preserve_location {
    public static void main(String[]args)
    {
        String str="Think Twice";
        str=str.toLowerCase();
        String str1="";
        String [] array = str.split(" ");
        for(String element:array)
        {
            for(int i=element.length()-1;i>=0;i--)
            {
                str1=str1+element.charAt(i);

            }
            str1=str1+" ";

        }
        System.out.println(str1);
    }
}
