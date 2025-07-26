package TOP150;

public class LC45 {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                System.out.println("The Matching Element is:"+ i);
                return i;
            }

            if(nums[i]>target){
                System.out.println("The Setting of the Element is :"+ i);
                return i;
            }

            if(target>nums[nums.length-1]){
                return nums.length;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,5,6};
        int target = 5;

        LC45 lc45 = new LC45();
        lc45.searchInsert(nums,target);

    }
}
