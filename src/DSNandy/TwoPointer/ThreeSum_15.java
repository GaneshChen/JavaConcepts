package DSNandy.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {

    public static List<List<Integer>> threeSum(int[] a){

        List<List<Integer>> tripletsWithDuplicate = new ArrayList<>();
        List<List<Integer>> newList = new ArrayList<>();

        Arrays.sort(a);

        for (int i=0 ; i<a.length-2 ; i++)
        {
            for (int j=i+1 ; j<a.length-1; j++)
            {
                for (int k=j+1 ; k<a.length ;k++){
                    if(a[i]+a[j]+a[k]==0){
                       // System.out.println(i+" "+j+" "+k);

                        for(List<Integer> element : tripletsWithDuplicate){
                            if(!tripletsWithDuplicate.contains(element))
                                tripletsWithDuplicate.add(Arrays.asList(a[i],a[j],a[k]));
                        }
                    }
                }
            }
        }

       /*   for(List<Integer> element : tripletsWithDuplicate){

              if(!newList.contains(element)){
                  newList.add(element);
              }
          }*/


        return tripletsWithDuplicate;
    }

    public static void main(String[] args) {

        int[] a = {-1,0,1,2,-1,-4};
        List<List<Integer>> abc =  threeSum(a);
        System.out.println(abc);

    }
}
