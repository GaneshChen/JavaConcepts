package DSNandy.BasicsWithTraversal;

import java.util.ArrayList;


public class ArraySubset_40 {

    public static void main(String[] args) {

        int[] arr1 = {11, 1, 13, 21, 3, 7 };

        int[] arr2 = {11,3,21,1};

        int m = arr1.length;
        int n = arr2.length;
        boolean result = true;

        ArrayList<Integer> addElement = new ArrayList<>();

        for (int i=0; i<n ; i++){
            for (int j=0 ;j<m; j++){
                if(arr2[i]==arr1[j]){
                    addElement.add(arr2[i]);
                    break;
               }
                else
                    result = false;
           }
        }

        if(arr2.length == addElement.size()) {

            for (int i=0; i<arr2.length; i++){

                if(addElement.contains(arr2[i])){
                    result = true;
                }
               else {
                   result=false;
                }
            }
        }
        else
            result =false;

        if(result)
            System.out.println("Array is a Subset");
        else
            System.out.println("Array is NOT a Subset");

    }
}
