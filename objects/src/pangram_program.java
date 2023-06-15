import java.util.Arrays;

public class pangram_program {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog";
        String str_Space1 = "";
        Boolean flag=true;

//        ---------------------------------
//        for removing white spaces in string
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                continue;
            } else {
                str_Space1 = str_Space1 + str1.charAt(i);
            }
        }
//     ------------------------------------
        //        for converting string into uppercase
        char[] array1 = str_Space1.toCharArray();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] >= 'a' && array1[i] <= 'z') {
                array1[i] = (char) (array1[i] - 32);
            }
        }
//        --------------------------------------------
        int[] array2=new int [26];
        for(int i=0;i< array1.length;i++)
        {
            array2[array1[i]-65]++;

        }
      for(int n:array2)
      {
          if(n==0)
          {
              flag=false;
          }
      }
      if(flag==false)
      {
          System.out.println("The string is not a pangram");
      }
      else
      {
          System.out.println("The string is a pangram");
      }

    }
}
