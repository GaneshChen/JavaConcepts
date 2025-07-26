package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LC1748SumUniquq {

    public static void main(String[] args) {

        int[] nums = {1,2,3,2};
        int j = 0;
        int sum = 0;
        Arrays.sort(nums);
        int[] newArray = new int[nums.length];
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=0 ; i<nums.length ; i++)
        {
            if(i<nums.length-1 && nums[i] == nums[i+1]){
                arrayList.add(nums[i]);
                continue;
            }

            else{
                if (arrayList.contains(nums[i])){

                }
                else {
                    newArray[j++] = nums[i];
                }

            }

        }
            for(int i=0 ; i< newArray.length; i++){
                sum = sum + newArray[i];
            }
        System.out.println(sum);
    }
}
