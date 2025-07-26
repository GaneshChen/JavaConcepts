package DSNandy_Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Union_49 {

    static void getUnion(int[] a, int n, int[] b, int m)
    {
        HashSet<Integer> s = new HashSet<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        String str = "abcd";
        Set<Integer> set = new HashSet<>();



        for (int i=0;i<n;i++)
            s.add(a[i]);

        for (int i=0;i<m;i++)
            s.add(b[i]);

        System.out.println("Number of Elements after Union Operation is :"+s.size());
        //System.out.println(s.toString());
        System.out.println(s);

    }

    public static void main(String[] args) {

        int[] a = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
        int[] b = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };

        getUnion(a,a.length,b,b.length);

    }
}
