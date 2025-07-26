package LeetCode.Arrays;

import java.util.ArrayList;

public class Duplicate_SortedArray {
    public static void removeDuplicates(int[] nums) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0 ; i< nums.length-1; i++)
        {
            for (int j =i+1 ; j< nums.length; j++){
                if(nums[i]!= nums[j]){

                    if(arrayList.contains(nums[i])){
                        arrayList.add(nums[i]);
                        break;
                    }

               }

            }
        }

        for (int k = 0 ; k<arrayList.size(); k++)
            System.out.print(arrayList.get(k)+ " ");


    }

    public static void main(String[] args) {

        int[] nums = {5,5,9};
        removeDuplicates(nums);
    }
}
