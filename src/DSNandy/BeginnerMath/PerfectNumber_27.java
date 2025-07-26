package DSNandy.BeginnerMath;

public class PerfectNumber_27 {

    public static void main(String[] args) {

        int number = 49;
        int sum = 0;
        for (int i=1 ; i<number; i++){
            if (number%i==0){
                System.out.print(i+" ");
                sum = sum+i;
            }
        }
        if (sum==number)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}
