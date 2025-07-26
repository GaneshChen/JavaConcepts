package TOP150;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LC125 {

    public static boolean validPalindrome(String str){

        String s= Pattern.compile("[^a-z A-Z 0-9]").matcher(str).replaceAll("")
                .replaceAll("\\s","")
                .toLowerCase();

        int left =0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "0P";
        boolean abc = validPalindrome(s);
        System.out.println(abc);
    }
}
