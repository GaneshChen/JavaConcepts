package TOP150;

public class LC189 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] newArray = new int[nums.length];
        int count=0;

        for(int i=k+1 ; i<nums.length ; i++){
            newArray[count++] = nums[i];
        }

       for(int i=0 ; i<=k ; i++){
           newArray[count++] = nums[i];
       }

       for(int i=0 ; i< newArray.length ; i++){
           System.out.println(newArray[i]);
       }
    }
}
