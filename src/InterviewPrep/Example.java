package InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class Example {

    public Map<String,String> mapMethod() {


        Map<String, String> myMap = new HashMap<>();
        myMap.put("a", "b");
        myMap.put("c", "d");

        return  myMap;

        }

    public static void main(String[] args) {
       Example example = new Example();
       Map<String,String> map = new HashMap<>();
       map = example.mapMethod();
       System.out.println(map);
    }
}

