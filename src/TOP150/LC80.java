package TOP150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LC80 {

    public static void main(String[] args) {

        int[] nums = {-3,-1,0,0,0,3,3};
        int count=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();


        for (int i=0; i< nums.length ; i++){
            if(hm.containsKey(nums[i])){
                     hm.put(nums[i],hm.get(nums[i])+1);
                }
            else{
                hm.put(nums[i],1);
            }
        }
        System.out.println(hm);
        Iterator<Map.Entry<Integer,Integer>> iterator = hm.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = iterator.next();
            int keyHM = entry.getKey().intValue();
            int valueHM = entry.getValue().intValue();
            if(valueHM<=2){
                for(int i=0 ; i<valueHM ; i++){
                    nums[count++] = keyHM;
                }
            }
            else{
                for(int i=0 ; i<2; i++){
                    nums[count++] = keyHM;
                }
            }
        }

        for(int i = 0 ; i<count ; i++){
            System.out.println(nums[i]);
        }
        System.out.println("The Count is :"+count);
    }
}
