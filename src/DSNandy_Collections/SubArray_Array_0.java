package DSNandy_Collections;

import java.util.HashSet;
import java.util.Set;

public class SubArray_Array_0 {

    public static boolean hasZeroSumSubArray(int[] nums){

        Set<Integer> set = new HashSet<>();

        //set.add(0);

        int sum=0;

        for (int value: nums)
        {
            sum=sum+value;

            System.out.println("The sum is : "+sum);
            System.out.println("The Beginning Set is : "+set);

            if(set.contains(0)){
                return true;
            }
            set.add(sum);

            System.out.println("The Ending Set is :"+set);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4,-6,3,-9,4,2,7};

        if(hasZeroSumSubArray(nums))
            System.out.println("Subarray Exists");
        else
            System.out.println("Subarray does not Exists");
    }
}
