import java.util.Arrays;

public class maximun_occuring_letter {
    public static void main(String[]args)
    {
        String str="Khushi kumari Gupta";
        str=str.replace(" ","");
        char[] array1=str.toCharArray();
        char[] array2=new char[128];
        for(int i=0;i< array1.length;i++)
        {
           array2[array1[i]]++;
        }
        int max=-1;
        char ch=' ';
        for(int i=0;i<array1.length;i++)
        {
            int number=array2[array1[i]];
         if(max<number)
         {
             max=number;
             ch=array1[i];
         }

        }
        System.out.println("The "+ch +" character occured "+max+" times which is maximum among all.");

    }
}


