package Arrays_Hashing.Easy;

public class LC_3110_Score_String {

    public int scoreOfString(String s) {

        int sum = 0;

        for(int i=0 ; i<s.length()-1; i++){
            int first = (int)s.charAt(i);
            int second = (int)s.charAt(i+1);
            sum = sum +Math.abs(first-second);
        }
        return sum;
    }

    public static void main(String[] args) {
        LC_3110_Score_String LC = new LC_3110_Score_String();
        System.out.println("The OutPut is :"+ LC.scoreOfString("hello"));
    }
}
