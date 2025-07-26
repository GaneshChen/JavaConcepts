package TOP150;

import java.util.*;

public class LC15 {
    public static void main(String[] args) {

        int[] nums = {-1,0,1,0};
        int i = 0;
        int j = nums.length - 2;
        int k = nums.length - 1;

        //Arrays.sort(nums);

        List<List<Integer>> triplets = new ArrayList<>();
        List<List<Integer>> destination = new ArrayList<>();

        while (i < j && j < k) {

                   if (nums[i] + nums[j] + nums[k] == 0) {

                           if (!triplets.contains(Arrays.asList(nums[i], nums[j], nums[k]))) {
                        triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }

                }
                         //i++;
                         j--;
                         k--;
            }



        System.out.println(triplets);
        System.out.println(destination);

    }

}
