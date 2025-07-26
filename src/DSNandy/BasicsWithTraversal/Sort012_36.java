package DSNandy.BasicsWithTraversal;

public class Sort012_36 {

    public static void main(String[] args) {

        int[] a = {0, 2, 1, 2, 0};

        int c0 = 0;
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                c0++;
            else if (a[i] == 1)
                c1++;
            else
                c2++;
        }

        for(int j=0 ; j<c0 ; j++)
            a[j] = 0;
        for (int j=c0 ; j<c0+c1 ; j++)
            a[j] = 1;
        for (int j= c0+c1 ; j<a.length;j++)
            a[j] = 2;

        for (int m=0 ; m<a.length; m++)
            System.out.print(a[m]+" ");
    }

}
