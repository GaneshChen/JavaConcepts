package JavaStreams;

public class LC387 {

    public static void main(String[] args) {

        String s = "leetcode";

        int[] freq = new int[26];
        char[] charArr = s.toCharArray();
        for(char ch:charArr){
            freq[ch-'a']++;
        }

        for(int i=0 ; i< charArr.length ; i++){
            if (freq[charArr[i] - 'a']==1){

            }
        }
    }
}
