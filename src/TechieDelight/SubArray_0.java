package TechieDelight;

import java.util.HashSet;
import java.util.Set;

public class SubArray_0 {

    public static boolean hasZeroSumSubArray(int[] nums){

        Set<Integer> set = new HashSet<>();

        //Insert Zero into the set, to handle when the first element Starts with Zero Sum

        set.add(0);

        int sum=0;

        //Traverse the Array

        for (int value:nums) {
            sum = sum + value;

            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {99, -15, 3, -7, 4, 2, 7};

                if(hasZeroSumSubArray(nums))
                   System.out.println("Sub Array exists");
                else
                   System.out.println("Sub Array NOT exists");
    }
}
