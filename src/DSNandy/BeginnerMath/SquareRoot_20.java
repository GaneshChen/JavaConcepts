package DSNandy.BeginnerMath;

public class SquareRoot_20 {
    public static void squareRootCalc(int number, int power)
    {
        int sum = number;
        for (int i =1 ; i<power ; i++){
            sum = sum*number;
        }
        System.out.println("The Power of the Number is :"+sum);
    }
    public static void main(String[] args) {
            squareRootCalc(8,10);
    }
}
