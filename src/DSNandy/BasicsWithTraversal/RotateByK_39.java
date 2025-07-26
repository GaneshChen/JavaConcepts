package DSNandy.BasicsWithTraversal;

import java.util.Arrays;

public class RotateByK_39 {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70};
        int k =3;

        for (int i=0; i<k ; i++){

            int temp = arr[arr.length-1];

            for (int j=arr.length-1;j>0 ; j--){
                arr[j] = arr[j-1];
            }

            arr[0] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
