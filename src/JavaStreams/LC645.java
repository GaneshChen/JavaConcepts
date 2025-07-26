package JavaStreams;

import java.util.HashMap;
import java.util.Map;

class LC645 {
    public static int findSpecialInteger(int[] arr) {

        int max = (arr.length) / 4;
        Integer Max_Value = Integer.valueOf(max);
        int a;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i])+ 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm);

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {

            if (entry.getValue() > Max_Value) {
                Integer abc = entry.getKey();
                a = abc;
                System.out.println("The Key is : "+ a);
                return a;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,6,6,6,6,7,10};
       int a = findSpecialInteger(nums);
        System.out.println(a);
    }

}