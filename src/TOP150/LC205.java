package TOP150;

import java.util.*;

public class LC205 {

    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";

       char[] sc =  s.toCharArray();
       char[] tc =  t.toCharArray();

        if(s.length()!=t.length()){

            System.out.println("FALSE : Length are NOT the Same");
       }

        HashMap<Character,Character> hm = new HashMap<>();

        for(int i=0 ; i< sc.length ; i++){

                if(hm.containsKey(sc[i])){
                    if(!hm.get(sc[i]).equals(tc[i]))
                    {
                        System.out.println("FALSE :  Charcters are NOT Matching");

                    }
                }
                else{
                    hm.put(sc[i],tc[i]);
                }
        }
        ArrayList<Character> arrayList = new ArrayList<>();

        Iterator<Map.Entry<Character,Character>> iterator = hm.entrySet().iterator();
            while(iterator.hasNext()) {
            Map.Entry<Character, Character> entry = iterator.next();
            Character cc =  entry.getValue();
                if(!arrayList.contains(cc)){
                    arrayList.add(cc);
                }
                else{

                }

        }
    }
}
