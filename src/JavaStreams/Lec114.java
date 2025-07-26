package JavaStreams;

import java.util.ArrayList;
import java.util.List;

public class Lec114 {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);

        List<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(6);

        List<Integer> c = new ArrayList<>();
        c.add(7);
        c.add(8);
        c.add(9);

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(a);
        lists.add(b);
        lists.add(c);

        lists.stream()
                .flatMap(l->l.stream())
                .map(i-> i *i)
                .forEach(i-> System.out.println(i));
    }
}
