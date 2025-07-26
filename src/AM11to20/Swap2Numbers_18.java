package AM11to20;

public class Swap2Numbers_18 {

    public static void main(String[] args) {

        int x = 100 ; int y = 200;

        System.out.println("Before Swapping:");
        System.out.println("The Value of X is: "+ x);
        System.out.println("The Value of Y is: "+ y);

        int temp = x;
        x = y;
        y=temp;

        System.out.println("After Swapping:");
        System.out.println("The Value of X is: "+ x);
        System.out.println("The Value of Y is: "+ y);

    }
}
