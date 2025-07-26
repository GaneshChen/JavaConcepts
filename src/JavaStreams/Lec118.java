package JavaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lec118 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("cat");
        list.add("ball");
        list.add("dog");

        Optional<String> op = list.stream()
                .filter(s->s.length()>3)
                 .findFirst();
        if(op.isPresent()){
           String abc = op.get();
            System.out.println(abc);
        }

        /*System.out.println(list.stream()
                .filter(s->s.length()>10)
                .findFirst());*/


    }
}
