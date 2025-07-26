package InterviewPrep;

public class LoopDemo {

    public static int[] replaceElement(int[] arr){

        int maxOfRight = -1;

        for(int i= arr.length-1 ; i>=0 ; --i){

            int a = arr[i];
            arr[i] = maxOfRight;
            maxOfRight = Math.max(maxOfRight,a);
            Math.abs(9);
        }
        return arr;
    }

    public static void main(String[] args) {
       int[] arr = {17,18,5,4,6,1};
       int[] result = replaceElement(arr);

       for(int i=0 ; i< result.length; i++){
           System.out.println(result[i]);
       }
    }
}
