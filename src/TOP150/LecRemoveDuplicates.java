package TOP150;

import java.util.HashMap;

public class LecRemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};

            HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0 ; i< arr.length ; i++){

            if(!hm.containsKey(arr[i])){

                hm.put(arr[i],1);
            }

        }
    }
}
