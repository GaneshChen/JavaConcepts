package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lec132 {

    public static void main(String[] args) {

        int[] arr = {95,86,77,71};
        Arrays.stream(arr).
        filter(i->i>75)
        .forEach(i-> System.out.println(i));

        List<String> list = new ArrayList<>();
        list.add("Apple"); list.add("Apple"); list.add("Ball");
        list.add("Boy");
        list.add("Cat");
        list.add("Dog");
        list.add("Delta");
        System.out.println("The Originial List is : "+list);

         String abc = list.stream()
                .filter(s->s.length()>3)
                .collect(Collectors.joining(","));

      Map<Integer, List<String>> map = list.stream()
              .collect(Collectors.groupingBy(s->s.length()));

        System.out.println(map.get(4));
      System.out.println(map);

    }
}
