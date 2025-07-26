package DSNandy_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {

     public static void main(String[] args) {

         String[] s = {"h","e","l","l","o"};
         System.out.println(s.length);
         char[] newchar = new char[s.length];
         int count = 0;
         for (int i = s.length-1; i>=0 ; i--){
            newchar[count++] = s[i].charAt(i);
             System.out.println(newchar);
         }
    }
}