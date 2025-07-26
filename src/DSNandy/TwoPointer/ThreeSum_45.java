package DSNandy.TwoPointer;

public class ThreeSum_45 {

    public static void main(String[] args) {
        int[] a = {1,4,45,6,10,8};
        int sum = 16;
        int count = 0;

        for (int i=0 ; i<a.length-2 ; i++)
        {
            for (int j=i+1 ; j<a.length-1; j++)
            {
                for (int k=j+1 ; k<a.length ;k++){
                    if(a[i]+a[j]+a[k]==sum){
                        ++count;
                        System.out.println("Triplet is: "+a[i]+" , "+a[j]+" , "+a[k]);
                    }
                }
            }
        }
            if(count<=0)
                System.out.println("Matching NOT found");
    }
}
