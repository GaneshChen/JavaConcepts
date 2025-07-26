package DSNandy.BasicsWithTraversal;

public class MissingNumber_34 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int sum=0;
        for (int i=0; i<a.length; i++){
            sum = sum+a[i];
        }
        System.out.println("The Sum of the Given Number is : "+ sum);
        int sum1 = 0;
        for (int j=1; j<=10; j++){
            sum1 =sum1+j;
        }
        System.out.println("The Sum of Continuation of Numbers is : "+ sum1);

        System.out.println("The Difference between the Numbers is : "+ (sum1-sum));
    }
}
