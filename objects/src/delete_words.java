public class delete_words {
    public static void main(String[]args) {
        String str = "Hello,have a good day.";
        str=str.toLowerCase();
        str=str.replaceAll("b|c|d|f|g|h|i|j|k|l|m|n|p|q|r|s|t|v|w|x|y|z","");
        System.out.println(str);



    }
}
