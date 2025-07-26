package DSNandy.BasicsWithTraversal;

public class MinandMax_31 {

    public static void main(String[] args) {
        int[] array = {10,20,30,67,7,56,43};
        int maximum = array[0];
        int minimum = array[0];

        for (int i =0 ; i<array.length;i++){
            if(array[i]>maximum)
                maximum = array[i];
        }
        System.out.println("The Maximum Value is : "+ maximum);

        for (int i =0 ; i<array.length;i++){
            if(array[i]<minimum)
                minimum = array[i];
        }
        System.out.println("The Minimum Value is : "+ minimum);

    }
}
