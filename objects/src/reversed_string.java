public class reversed_string {
    public static void main(String[]args)
    {
        String s1="Raman Sharma";
        String s2=" ";
        String s=" ";
        String arr[] = s1.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
System.out.print(" ");
            for(int j=arr[i].length()-1;j>=0;j--)
            {
                s=s+arr[i].charAt(j);
            }

        }


        System.out.println(s);
    }

}
