package AM31to40;

public class DuplicateArray {

    public static void main(String[] args) {

        int[] a = {77,54,-76,89,51,76,9,-87,-76,100};

        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]==a[j])
                    System.out.println(a[i]);
            }
        }
    }
}
