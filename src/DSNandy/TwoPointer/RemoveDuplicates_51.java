package DSNandy.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates_51 {

    public static void main(String[] args) {

        int[] array1 = {5, 2, 6, 8, 6, 7, 5, 2, 8};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<array1.length ; i++){
            for (int j=0; j<array1.length ; j++){
                if(array1[i]==array1[j]){
                    if(arrayList.contains(array1[i]))
                    {

                    }
                    else {
                        arrayList.add(array1[i]);
                    }
                }
            }
        }

        Object[] temp = arrayList.toArray();
            for (int i = 0 ; i<temp.length ; i++)
                System.out.print(temp[i]+" ");

    }
}