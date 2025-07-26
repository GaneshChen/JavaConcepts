package Java_Streams_Sep2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LC118CountDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");

        Optional<String> op = list.stream()
                .filter(s->s.length()>10)
                .findFirst();

        if(op.isPresent()){
            op.get();
        }

        long abc = list.stream()
                .filter(s->s.length()>=3)
                .count();
        System.out.println(abc);
    }
}
