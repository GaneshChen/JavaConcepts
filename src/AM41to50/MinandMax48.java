package AM41to50;

import java.util.Arrays;

public class MinandMax48 {

    public static void main(String[] args) {
        int[] a = {100,76,45,432,-7,177};
        Arrays.sort(a);
        int min = a[0];
        int max = a[a.length-1];

        System.out.println("The Minimum Value is: "+min);
        System.out.println("The Maximum Value is: "+max);

        int maxArray = a[0];
        int minArray =a[0];

        for (int i=0; i<a.length;i++){
            if(a[i]>maxArray){
                maxArray = a[i];
            }

        }
        System.out.println("The Maximum_Array Value is: "+maxArray);

        for (int i=0; i<a.length;i++){
            if(a[i]<minArray){
                minArray = a[i];
            }

        }
        System.out.println("The Maximum_Array Value is: "+minArray);

    }
}
