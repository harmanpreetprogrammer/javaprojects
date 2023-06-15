import java.util.Arrays;

public class anagram_program {
    public static void main(String[]args)
    {
     String str1="The Classroom";
     String str_Space1="";
     String str2="School Master";
        String str_Space2="";
//        ---------------------------------
//        for removing white spaces in string1
     for(int i=0;i<str1.length();i++)
     {
         if(str1.charAt(i)==' ')
         {
             continue;
         }
         else {
             str_Space1=str_Space1+str1.charAt(i);
         }

     }
//     ------------------------------------
        //        for converting string1 into samecase
        char[] array1=str_Space1.toCharArray();
        for(int i=0;i< array1.length;i++)
        {
            if(array1[i]>='a' &&array1[i]<='z')
            {
                array1[i]=(char)(array1[i]-32);
            }
        }
//        -----------------------------------

        //        for removing white spaces in string2
        for(int i=0;i<str2.length();i++)
        {
            if(str2.charAt(i)==' ')
            {
                continue;
            }
            else {
                str_Space2=str_Space2+str2.charAt(i);
            }

        };
//        --------------------------------------------
        //        for converting string1 into samecase
        char[] array2=str_Space2.toCharArray();
        for(int i=0;i< array2.length;i++)
        {
            if(array2[i]>='a' &&array2[i]<='z')
            {
                array2[i]=(char)(array2[i]-32);
            }
        };
//        --------------------------------------------
        Arrays.sort(array1);
        Arrays.sort(array2);
//        System.out.println(array1);
//        System.out.println(array2);
        if(Arrays.equals(array1,array2))
        {
          System.out.println("This string is a anagram");
        }
        else {
            System.out.println("This string is not  a anagram");
       }
    }
}
