package TOP150;

public class LCLeftRotate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
        int ii = arr[0];
        int j = arr[n-1];

        for(int i=0 ; i<n-2 ; i++){
            arr[i] = arr[i+1];
        }
        arr[n-2] = j;
        arr[n-1] = ii;

        for(int i = 0 ; i< arr.length ; i++){
            System.out.println(arr[i]);
        }

    }
}
