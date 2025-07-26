package LeetCode.Arrays;

import java.util.*;

public class LC49GroupAnagram {


public static List<List<String>> groupAnagrams(String[] strs){

    Map<String, List<String>> m = new HashMap<>();

    for(String s : strs){

        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String s1 = String.valueOf(ch);

        if(!m.containsKey(s1)){
            m.put(s1,new ArrayList<>());
            System.out.println("***********"+m.values());
           Collection<List<String>> cc = m.values();
        }
        m.get(s1).add(s);
        System.out.println("Values**"+m.values());
    }
    return new ArrayList<>(m.values());
}


    public static void main(String[] args) {

    String[] s1 = {"act","pots","tops","cat","stop","hat"};
    List<List<String>>abc = groupAnagrams(s1);
        System.out.println(abc);
    }

}
