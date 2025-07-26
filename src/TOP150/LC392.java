package TOP150;

public class LC392 {

   public static boolean isSubsequence(String s, String t) {


       if(s.length()==0){
           return true;
       }
           int i=0;
           int j=0;

           while(i<s.length() && j<t.length()){

               if(s.charAt(i)==t.charAt(j)){
                   System.out.println(s.charAt(i));
                   System.out.println(s.charAt(j));
                   i++;
                   j++;
               }

               else{
                   j++;
               }
           }

           if(i==s.length()){
               return true;
           }
        return false;
    }

    public static void main(String[] args) {

       boolean abc = isSubsequence("axc","ahbgdc");
       System.out.println(abc);

    }

}
