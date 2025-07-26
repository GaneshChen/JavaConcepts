package DSNandy.TwoPointer;

public class PairSum_44 {

    public static void main(String[] args) {

        int[] a = {-5, 1, -40, 20, 6, 8, 7 };
        int targetSum = -39;
        int count=0;
        for (int i =0; i<a.length; i++){
            for (int j=i+1 ; j<a.length; j++){
                if(a[i]+a[j]==targetSum){
                    ++count;
                    System.out.println(+a[i]+","+a[j]);
                }
            }
        }
        if(count<=0)
            System.out.println("Pair is NOT found");
    }
}
