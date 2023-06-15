class basic
{
    public int show(int []b){

        int res=0;
        for(int n:b)
        {
            res=res+n;
        }

        return res;

    }
}


public class anonymous {
    public static void main(String[]args){
        basic obj=new basic();
//        int[] nos={9,7,5};
       int  result= obj.show(new int[]{3,5,6,7});
       System.out.println(result);
    }
}
