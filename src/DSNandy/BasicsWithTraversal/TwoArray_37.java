package DSNandy.BasicsWithTraversal;

import java.util.Arrays;

public class TwoArray_37 {

    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] b = {30,20,10,40,50,50,40};

        Arrays.sort(a);
        Arrays.sort(b);

        boolean compare = Arrays.equals(a,b);

       if(compare==true)
           System.out.println("Arrays are equal");
       else
           System.out.println("Arrays are NOT equal");

    }
}
