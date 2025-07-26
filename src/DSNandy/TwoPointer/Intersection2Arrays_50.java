package DSNandy.TwoPointer;

public class Intersection2Arrays_50 {

    public static void main(String[] args) {
        int[] myArray1 = {23, 36, 96, 78, 55};
        int[] myArray2 = {96, 45, 19, 73, -55};

            for (int i=0 ; i<myArray1.length; i++)
            {
                for (int j=0 ; j<myArray2.length; j++)
                {
                    if(myArray1[i]==myArray2[j])
                        System.out.print(myArray2[j]+" ");
                }
            }

    }
}
