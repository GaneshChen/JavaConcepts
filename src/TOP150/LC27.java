package TOP150;

public class LC27 {

    public void removeElement(int[] nums, int val) {

        int count=0;

        int[] newArray = new int[nums.length];

        for(int number : nums){

            if(number!=val)
                newArray[count++] = number;
       }

        for(int j=0 ; j<count; j++){
            System.out.println(newArray[j]);
        }


    }

    public static void main(String[] args) {
        LC27 lc27 = new LC27();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        lc27.removeElement(nums,val);

    }
}
