package DSNandy.BasicsWithTraversal;

import java.util.Arrays;

public class TwoArrayWithoutInbuilt_37 {

    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] b = {9,20,10,40,50};

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result = true;
        if(a.length==b.length){

            for(int i = 0; i<a.length ; i++){
                if(a[i]!=b[i]){
                result=false;
                }
            }
        }
        else {
            result= false;
        }
        if(result==true)
            System.out.println("Arrays are equal");
        else
            System.out.println("Arrays are NOT equal");
    }
}
