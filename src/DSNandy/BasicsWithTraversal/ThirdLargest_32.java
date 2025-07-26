package DSNandy.BasicsWithTraversal;

import java.util.Arrays;

public class ThirdLargest_32 {

    public static void main(String[] args) {
        int[] a = {11,6,23,67,98,101,5,38};

        Arrays.sort(a);

        if(a.length>=3){
            System.out.println(a[2]);
        }
        else {
            System.out.println(a[a.length-1]);
        }
    }
}
