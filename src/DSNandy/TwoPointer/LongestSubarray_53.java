package DSNandy.TwoPointer;

public class LongestSubarray_53 {

    public static void main(String[] args) {

        int[] array = {2,-1,4,-2};
        int n=array.length;
        int len=0;
        int target =10;
        for(int i=0 ; i<n; i++)
        {
            for(int j=i ; j <n; j++){

                long s = 0;

                for(int k=i ; k<=j ; k++){
                    s=s+array[k];

                }

                if(s==target)
                    System.out.println();

            }

        }
    }
}
