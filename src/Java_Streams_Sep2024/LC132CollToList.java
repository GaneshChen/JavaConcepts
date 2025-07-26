package Java_Streams_Sep2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LC132CollToList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Apple");
        list.add("Airplane");
        list.add("Ball");
        list.add("Boy");
        list.add("Cat");
        list.add("Dog");
        list.add("Delta");

      List<String> newList =  list.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());

      Set<String> newSet = list.stream()
                      .filter(s->s.length()>3)
                              .collect(Collectors.toSet());

      System.out.println("Original :: "+ list);
      System.out.println("New List ::"+ newList);
        System.out.println("New Set ::"+ newSet);


    }
}
