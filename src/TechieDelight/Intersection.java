package TechieDelight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

    public List<String> intersection(List<String> list1, List<String> list2){

        List<String> finalList = new ArrayList<>();

        for(String t : list1){
            if(list2.contains(t)){
                finalList.add(t);
            }
        }

        return finalList;
    }

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>
                (Arrays.asList("Dog", "Cat", "Human"));

        List<String> list2 = new ArrayList<String>
                (Arrays.asList("Human", "Dog", "Whale", "rabbit", "Cow"));

        List<String> finalList1 = new Intersection().intersection(list1,list2);

        System.out.println(finalList1);

    }
}
