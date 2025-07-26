package LeetCode.Arrays;

public class ReverseString {

      public static void main(String[] args) {

          String str = "Hello";
          char ch;
          String nstr = "";

          for (int i=str.length()-1; i>=0 ; i--){

              ch = str.charAt(i);
              nstr = nstr+ch;

          }

          System.out.println(nstr);
      }

}



