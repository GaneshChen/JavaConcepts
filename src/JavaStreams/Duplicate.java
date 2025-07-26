package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(String[] args) {

        int[] nums = new int[]{4,3,1,1,3,3,2};
        int k = 3;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0 ; i<nums.length; i++){

            if(hm.containsKey((nums[i]))){
                hm.put(nums[i], hm.get(nums[i])+1);
            }

            else{
                hm.put(nums[i],1);
            }
        }

        System.out.println(hm);
    }
}
