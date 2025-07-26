package TOP150;

import java.util.*;

public class LC383 {

    public static void main(String[] args) {

        String ransomNote = "fihjjjjei";
        char[] c1 = ransomNote.toCharArray();
        String magazine ="hjibagacbhadfaefdjaeaebgi";
        char[] m1 = magazine.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character,Integer> mz = new HashMap<>();

        for(int i=0 ; i< c1.length; i++){

            if(hm.containsKey(c1[i]))
                hm.put(c1[i], hm.get(c1[i])+1);
            else
                hm.put(c1[i],1);
        }

        for(int j=0 ; j<m1.length; j++){

            if(hm.containsKey(m1[j])){
               hm.put(m1[j],hm.get(m1[j])-1);
            }
        }

       System.out.println(hm);

       Iterator<Map.Entry<Character,Integer>> iterator = hm.entrySet().iterator();

       while(iterator.hasNext()){
           Map.Entry<Character,Integer> entry = iterator.next();
           Integer abc = entry.getValue();
           int a = abc;

           if(a>0){
               System.out.println("Sum is Failed");
           }

           //System.out.println("Sum is Passed");
       }


       }
    }

