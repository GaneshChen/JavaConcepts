package TOP150;

public class LC88 {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int m =3;
        int[] nums2 = {2,5,6};
        int n = 3;

        int i = m -1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }


        for(int nums : nums1){
            System.out.println(nums);
        }

    }
}
