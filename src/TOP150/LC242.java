package TOP150;

import java.util.HashMap;

public class LC242 {

    public static void main(String[] args) {
        String s ="anagram";
        char[] s1 = s.toCharArray();
        String t="nagarao";
        char[] t1 = t.toCharArray();

        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Character,Integer> tm = new HashMap<>();

        if(s.length()!=t.length()){
            System.out.println("False");
        }

        for(int i=0 ; i<s1.length ; i++){

            if(hm.containsKey(s1[i])){
                hm.put(s1[i],hm.get(s1[i])+1);
            }

            else{
                hm.put(s1[i],1);
            }
        }

        for(int j=0 ; j< t1.length; j++){

            if(tm.containsKey(t1[j])){
                tm.put(t1[j],tm.get(t1[j])+1);
            }
            else{
                tm.put(t1[j],1);
            }
        }

        if(hm.equals(tm)){
            System.out.println("This is True");
        }

        System.out.println("This is false");
    }
}
