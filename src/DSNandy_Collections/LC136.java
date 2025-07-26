package DSNandy_Collections;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;

class LC136 {
    public static int removeDuplicates(int[] nums) {

        


        int j=1;

        for(int i=1 ; i<nums.length ; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
       int[] nums = {1,3};
       int abc = removeDuplicates(nums);
        System.out.println(abc);
    }
}