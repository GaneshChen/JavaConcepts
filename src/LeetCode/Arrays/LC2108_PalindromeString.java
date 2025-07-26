package LeetCode.Arrays;

public class LC2108_PalindromeString {

    public static String firstPalindrome(String[] words) {

        for(int i=0 ; i< words.length ;i++){
            String extractWord = words[i];
            String newStr= "";
            char ch;
            for(int j=extractWord.length()-1 ; j>=0; j--) {
                ch = extractWord.charAt(j);
                newStr = newStr+ch;
            }
                 if(newStr.equals(extractWord)){
                       return words[i];
            }

        }

        return "";
    }

    public static void main(String[] args) {

        String[] words = {"cool"};
        String str =   firstPalindrome(words);
        System.out.println(str);
    }
}
