package Arrays_Hashing.Easy;

import java.util.Arrays;

public class LC_Concatenation_Array {
    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length*2];

        for(int i=0; i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+ nums.length] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        LC_Concatenation_Array lc = new LC_Concatenation_Array();
        int[] arr = {10,20,-10,5,6};
        System.out.println(Arrays.toString(lc.getConcatenation(arr)));
    }
}
