public class find_letter_in_word {

    public static void main(String[]args)
    {
        boolean checked=true;
        String s1="Umbrella";
        for(int i=0;i<s1.length();i++)
        {
            if('e'== s1.charAt(i))
            {
                System.out.println("This word exists in this string");
                checked=false;
            }

        }
        if(checked==true)
        {
            System.out.println("This word does not exists in this string");
        }



    }
}
