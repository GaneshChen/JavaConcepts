package JavaStreams;

import java.util.ArrayList;
import java.util.List;

public class Lec120 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("cat");
        list.add("ball");
        list.add("dog");

    boolean b = list.stream().filter(s->s.length()>3)
              .anyMatch(s->s.contains("p"));
        System.out.println(b);

        boolean c = list.stream().filter(s->s.length()>3)
                .noneMatch(s->s.contains("p"));
        System.out.println(c);
    }
}
