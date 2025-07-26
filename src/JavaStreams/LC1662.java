package JavaStreams;

import java.util.HashMap;
import java.util.Map;

class LC1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String newWord1= "";
        String newWord2= "";
        for(int i=0 ; i< word1.length ; i++){
            newWord1 = newWord1+word1[i];
        }
        for(int j=0 ; j< word2.length ; j++){
            newWord2 = newWord2+word2[j];
        }
        System.out.println(newWord1);
        System.out.println(newWord2);
        if (newWord1.equals(newWord2))
        {
            return true;
        }

        return false;
  }


    public static void main(String[] args) {

       String[] word1 = {"ab", "c"};
       String[] word2 = {"a", "bc"};
       boolean a = arrayStringsAreEqual(word1,word2);
       System.out.println(a);
    }

}