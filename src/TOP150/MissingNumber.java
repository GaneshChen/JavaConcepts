package TOP150;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class MissingNumber {

    public static int  numbers(int[] arr) {
        int result=0;
        int a =0;
        Map.Entry<Integer, Integer> entry = null;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++){

            if(hm.containsKey(arr[i]))
                hm.put(arr[i],hm.get(arr[i])+1);
            else
                hm.put(arr[i],1);
        }

        Iterator<Map.Entry<Integer,Integer>> iterator = hm.entrySet().iterator();

        while(iterator.hasNext()) {
            entry = iterator.next();
                if(entry.getValue().intValue()==1)
                    a = entry.getKey().intValue();
        }


        return a;

    }
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3,4,4};
        int n =8;
        int abc = numbers(arr);
        System.out.println(abc);
    }
}


