public class count_vowels_consts_symbols {
    public static void main(String[]args)
    {
        String str="RamanSharmaGupta(@**Code)";
        str=str.toLowerCase();
        int countVl=0;
        int countCt=0;
        int countSm=0;
        char  [] array1=str.toCharArray();
        char[] arrayVl={'a','e','i','o','u'};
        char[] arrayCt={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        char[] arraySm={'!','@','#','$','%','&','*','(',')'};

        for(int i=0;i< array1.length;i++) {
            int j;
            for (j = 0; j < arrayVl.length; j++) {
                if (array1[i] == arrayVl[j]) {
                    countVl++;
                }

            }
        }
        for(int i=0;i< array1.length;i++) {
            int j;
            for (j = 0; j < arrayCt.length; j++) {
                if (array1[i] == arrayCt[j]) {
                    countCt++;
                }

            }
        }
        for(int i=0;i< array1.length;i++) {
            int j;
            for (j = 0; j < arraySm.length; j++) {
                if (array1[i] == arraySm[j]) {
                    countSm++;
                }

            }
        }



        System.out.println("The number of Vowvels is/are:"+countVl);
       System.out.println("The number of Consonants are:"+countCt);
       System.out.println("The number of Special Symbols are:"+countSm);
    }
}
