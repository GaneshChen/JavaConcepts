package TechieDelight;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void findPair(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                System.out.println("Pair Found:");
                int a = nums[map.get(target - nums[i])];
                int b = nums[i];
                System.out.println(a + " ," + b);
                return;
            }
            map.put(nums[i], i);
        }
        System.out.println("Pair NOT Found");
    }

    public static void main(String[] args) {
        int[] nums = {8, 7, 2, 5, 2, 1};
        int target = 7;
        findPair(nums, target);
    }
}