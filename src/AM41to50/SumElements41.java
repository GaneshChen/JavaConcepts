package AM41to50;

public class SumElements41 {

    public static void main(String[] args) {
        int[] a = {30,10,40,50,-10,66,54};
        int sum = 0;

        for (int i=0;i<a.length;i++)
        {
            sum = sum+a[i];
        }
        System.out.println("The Sum of the elements is: "+sum);
    }
}
