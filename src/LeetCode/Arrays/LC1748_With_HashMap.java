package LeetCode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LC1748_With_HashMap {
    public static void main(String[] args) {
        int[] nums = {3,2,3,9};

        Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0 ; i< nums.length ; i++){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1 );
                }
                else{
                    map.put(nums[i],1);

                }
            }
            int sum = 0;

            for(Map.Entry<Integer,Integer> entry : map.entrySet()){

                if(entry.getValue()==1){
                    sum+= entry.getKey();
                }

            }
        System.out.println(sum);
    }
}
