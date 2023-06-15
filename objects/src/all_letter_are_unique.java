public class all_letter_are_unique {
    public static void main(String[]args)
    {

        Boolean flag=true;
        String str="Raman Sharma";
        str=str.toLowerCase();
        char[] array1=str.toCharArray();
        for(int i=0;i< array1.length;i++)
        { int j;
            for ( j=0;j< array1.length;j++)
            {
                if(array1[i]==array1[j])
                {
                    break;
                }


            }
            if(i!=j)
            {
               flag=false;

            }
        }
        if(flag==false)
        {
            System.out.println("All Characters are not unique");
        }
        else {
            System.out.println("All Characters are unique");
        }
    }
}
