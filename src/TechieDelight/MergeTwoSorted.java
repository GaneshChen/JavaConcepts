package TechieDelight;

import java.util.*;

public class MergeTwoSorted {

        public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 6};
        int[] b = {2,3,5};

        List<Integer> list = new ArrayList<>();

        for(int i=0 ; i<a.length; i++){
            if(!list.contains(a[i])){
                list.add(a[i]);
            }
        }

        for(int j=0 ; j<b.length ; j++){
            if(!list.contains(b[j])){
                list.add(b[j]);
            }
        }

        Collections.sort(list);
        System.out.println(list);

    }
}
