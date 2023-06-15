public class palindrome_program {
    public static void main(String[]args)
    {
        String str="2552";
        String str1="";
        for(int i=str.length()-1;i>=0;--i)
        {
            str1=str1+str.charAt(i);
        }

        if(str1.equals(str))
        {

            System.out.println("This string  is a palindrome.");
        }
        else
        {

            System.out.println("This string  is not a palindrome.");
        }
    }

}
