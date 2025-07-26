package Arrays_Hashing.Easy;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public boolean hasDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        for (int num : nums){

            if (seen.contains(num)){
                return true;
            }

            seen.add(num);
        }

       return false;
    }

    public static void main(String[] args) {

    }
}
