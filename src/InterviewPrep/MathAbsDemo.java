package InterviewPrep;

import java.util.ArrayList;
import java.util.List;

public class MathAbsDemo {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {

            int idx = Math.abs(nums[i]) - 1;

            if (nums[idx] < 0)
                continue;

            nums[idx] *= -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                result.add(i + 1);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numarr = {4,3,2,7,8,2,3,2};
       List<Integer> resultset = findDisappearedNumbers(numarr);

       for(int i=0; i< resultset.size();i++)
       {
           System.out.println(resultset.get(i));
       }


    }

}
