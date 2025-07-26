package DSNandy.BeginnerMath;

public class PrimeNumber_23 {


    public static void getPrime(int number){
        int count = 0;

        if(number==0 || number==1)
            System.out.println("Not a Prime Number");

        for(int i=2 ; i<number ; i++){
            if(number%i==0)
            {
                ++count;
                break;
            }
        }

        if(count>0)
            System.out.println("Number " +number+ " is NOT a prime Number");
        else
            System.out.println("Number "+ number + " is a prime Number");
    }

    public static void main(String[] args) {
        getPrime(7);

    }
}
