package TOP150;

import java.util.HashMap;

public class HMDemo {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(11,0);
        hm.put(12,1);
        hm.put(13,2);
        hm.put(14,3);
        hm.put(12,4);

        System.out.println(hm);
    }
}
