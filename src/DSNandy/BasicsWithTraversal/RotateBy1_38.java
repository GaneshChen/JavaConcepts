package DSNandy.BasicsWithTraversal;

import java.util.Arrays;

public class RotateBy1_38 {

    public static void main(String[] args) {

            int[] arr = {10,20,30,40,50,60};

            int lastDigit = arr[arr.length-1];

            for (int i=arr.length-1 ;i>0  ;i--){
                arr[i] = arr[i-1];
            }

                arr[0] = lastDigit;

        System.out.println(Arrays.toString(arr));
           }
        }


