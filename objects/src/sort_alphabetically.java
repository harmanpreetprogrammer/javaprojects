import java.awt.*;

public class sort_alphabetically {
    public static void main(String[]args)
    {
        String str="Raman Sharma";
        str=str.toLowerCase();
        char array[]=str.toCharArray();
        for(int j=0;j< array.length;j++)
        {
        for(int i=0;i< array.length-1-j;i++)
        { char temp=' ';
            int element1=array[i];
            int element2=array[i+1];
            if(element1>element2) {

                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }

            }

        }
     for(int i=0;i< array.length;i++)
     {
         System.out.print(array[i]);
     }
    }
}
