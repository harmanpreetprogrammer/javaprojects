package arrays.unique_occurence;
import java.util.Scanner;

        class Solution2 {
            public int firstUniqChar(String s) {
                int ans = Integer.MAX_VALUE;
                for(char c='a'; c<='z';c++){
                    int index = s.indexOf(c);
                    if(index!=-1&&index==s.lastIndexOf(c)){
                        ans = Math.min(ans,index);
                    }
                }

                return ans==Integer.MAX_VALUE?-1:ans;
            }
}
public class optimized_app {
public static void main(String[]args)
{
    Scanner scan=new Scanner(System.in);
    Solution2 obj=new Solution2();
    String str= "loveleetcode";
    int res=obj.firstUniqChar(str);
    System.out.println(res);
}
}
