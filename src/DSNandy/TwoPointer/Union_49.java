package DSNandy.TwoPointer;

import java.util.Arrays;
import java.util.HashSet;

public class Union_49 {

    public static void main(String[] args) {
        Integer[] array1 = {12, 13, 5, 16, 9, 19};
        Integer[] array2 = {16, 2, 60, 9, 8, 5};

        HashSet<Integer> set = new HashSet<>();

        set.addAll(Arrays.asList(array1));
        set.addAll(Arrays.asList(array2));

        Object[] values = set.toArray();

        for (int i =0 ; i<values.length ; i++){

            System.out.print(values[i]+" ");
        }

    }
}
