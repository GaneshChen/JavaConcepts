package DSNandy_Collections;

import java.util.HashSet;

public class PairSum_44 {

    static void printPairs(int[] arr, int sum){

        HashSet<Integer> s = new HashSet<>();

        for (int i =0; i< arr.length; ++i){
            int temp = sum - arr[i];

            if(s.contains(temp)){
                System.out.println("Yes");
                return;
            }

            s.add(arr[i]);
        }

        System.out.println("No");
    }

    public static void main(String[] args) {

        int[] a = {1,4,45,6,10,8};
        int n = 17;
        printPairs(a,n);
    }
}
