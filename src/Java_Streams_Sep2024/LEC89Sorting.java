package Java_Streams_Sep2024;

import java.util.ArrayList;
import java.util.List;

public class LEC89Sorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println("Starting");
        list.stream()
                .filter(i-> {
                            System.out.println("filter received :: " + i);
                            return i % 2 == 0;
                        })
                .sorted()
                .limit(3)
                .map(i->{
                    System.out.println("Map Received ::" + i);
                    return i*i;
                })
                .forEach(i-> System.out.println(i));
        System.out.println("Ending");


    }
}
