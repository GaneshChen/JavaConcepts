package TOP150;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LC290 {

    public static boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");

        if(pattern.length()!= arr.length){
            return false;
        }

        HashMap<Character,String> hm = new HashMap<>();

        for(int i=0 ; i<pattern.length();i++){

            char ch = pattern.charAt(i);

            if(hm.containsKey(ch)){
                if(!hm.get(ch).equals(arr[i])){
                    return false;
                }
            }

            else{
                hm.put(ch,arr[i]);
            }

        }
        Iterator<Map.Entry<Character,String>> iterator = hm.entrySet().iterator();
        HashMap <String,Integer> hashMap = new HashMap<>();

        while (iterator.hasNext()){
            int i =1;
            Map.Entry<Character,String> entry = iterator.next();
            String value = entry.getValue();

            if(hashMap.containsKey(value)){
                return false;
            }

            else {
                hashMap.put(value,i++);
            }

        }
        return true;
    }

    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog dog dog dog";

       boolean ans = wordPattern(pattern,s);
        System.out.println(ans);
    }
}
